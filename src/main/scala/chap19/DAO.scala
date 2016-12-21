package chap19

/**
  * Created by adwivedi on 18/12/16.
  */
trait DAO[T] {
  def save (dao:T): Unit = {println("Saving .. : " + dao.getClass)}
}

trait common
class Person(val name:String, val lname:String) extends common
class Fruit(val name:String) extends common

object MyList extends DAO[common] {
  def saveList(list: List[common] ): Unit = list.foreach(save)

}

object Test extends App {
  val p1 = new Person("Ash","Dwi")
  val p2 = new Person("Ish","Dwi")

  val f1 = new Fruit("Apple")
  val f2 = new Fruit("Orange")

  val pList = List(p1,p2,f1,f2)
  MyList saveList pList

  MyList.saveList(List(p1,p2))

}
