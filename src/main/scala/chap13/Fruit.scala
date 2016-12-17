package chap13

/**
  * Created by adwivedi on 16/12/16.
  */
class Fruit {
  import chap13.seeMe._
  def showF(): Unit = println(canYouSeeMe)
}

private class Apple extends Fruit{
  //import chap13.Nuts._
  Nuts.newshowNut
}
