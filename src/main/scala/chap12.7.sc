abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}
import scala.collection.mutable.ArrayBuffer
class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) = { buf += x }
}

val queue = new BasicIntQueue
queue.put(10)
queue.put(20)
queue.get()
queue.get()

trait Doubling extends IntQueue {
  abstract override def put(x:Int) = { super.put (x * 2 ) }
}
val queue1 = new BasicIntQueue with Doubling
queue1.put(10)
queue1.put(20)
queue1.get()
queue1.get()