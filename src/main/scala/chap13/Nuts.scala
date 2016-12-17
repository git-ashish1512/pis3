package chap13

/**
  * Created by adwivedi on 16/12/16.
  */
class Nuts(val newnut:String) {
  val nut: String = newnut
  def showNut = println(nut)
  //import chap13.Fruit
  def showFruit = (new Fruit).showF()

  def showApple = (new Apple).showF()
}

object Nuts{
  def newshowNut =println("new Show Nut")
}