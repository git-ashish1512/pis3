def isort(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else {println("xs: " + xs); insert(xs.head, isort(xs.tail)) }

def insert(x: Int, xs: List[Int]): List[Int] =
  if (xs.isEmpty || x <= xs.head) {println("x: " + x + " xs: " + xs); x :: xs }
  else xs.head :: insert(x, xs.tail)

val list = List (4,3,5,2,1)
//isort(list)

list.head
val (a :: b  :: c ) = list
val newlist = list.reverse
list.init
list.last
newlist.length

val tlist = list ::: newlist
tlist(2)
tlist.indices
tlist.take(2)
tlist.takeRight(2)
tlist.takeWhile( _ < 5 )
tlist.drop(2)
tlist.dropRight(2)
tlist.dropWhile(_<5)

val abc = List("a", "b", "c", "d" , "e" )
val z = list.sorted zip abc
//z.unzip
//z.mkString("|",";","|")
z.map(_.swap)
z.map( {case (x,y) => (y,x)}  )
z.foreach(println(_))
z.filter( _._1 < 5 )
z.filter( {case (x,y) => x < 5}  )

z.partition( _._1 < 5 )
z.find( _._1== 5 )
tlist.span( _ < 5 )

object Color extends Enumeration {
  val Red, Green, Blue = Value
}
Color.Blue
Color.values