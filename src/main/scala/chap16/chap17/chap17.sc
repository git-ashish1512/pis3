import scala.collection.immutable.TreeMap
import scala.language.postfixOps

//SETs
val s = Set(1, 2, 3, 4 ,4)
val s1 =  Set("a", "b" , "c" , "d" , "e")
val s2 = s zip s1
val s3 = s + 5
val s4 = s3 ++ List (6,7)
s4.size
s4.contains(6)
s4 - 3
s4 & s
s == (s4 & s)
s4.filter(_%2 ==0)
s2.unzip
val s5 = s4.zipWithIndex
for (ss <- s5) println(ss._1 , ss._2)
s5 map {case (x,y) => x*y}
val str = "The way this code works is that a mutable map, named counts, maps each word to the number of times it occurs in the text. For each word in the text, the word's old count is looked up, that count is incremented by one, and the new count is saved back into counts. Note the use of contains to check whether a word has been seen yet or not. If counts.contains(word) is not true, then the word has not yet been seen and zero is used for the count"

val strs = str.split("[ ,!.]+")
val strs2 = strs.groupBy((word:String) => word).mapValues(_.length)
(strs2 -- strs2.keySet.toList).toString()
  strs2.init

val tm = TreeMap(strs2 toArray: _*)

var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))
capital


val strList = strs.toList
strList.foldLeft ("    ") ( {(x,y) => if(x.length < y.length) x else y } )

("" /: strs.toList)  ( {(x,y) => if(x.length > y.length) x else y } )