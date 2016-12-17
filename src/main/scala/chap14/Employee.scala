package chap14

/**
  * Created by adwivedi on 16/12/16.
  */
abstract case class Employee (val id:Int, val name:String, val location:String) {
  override def toString = "Id : " + id + " Name: " + name + " Location: " + location

  override def equals(obj: Any): Boolean = obj match {
    case obj: Employee => this.id == obj.id
    case _ => false
  }

  override def hashCode(): Int = id * name.hashCode * location.hashCode
}

class LondonEmployee (override val id:Int, override val name:String) extends Employee (id, name, "London")

class PuneEmployee (override val id:Int, override val name:String) extends Employee (id, name, "Pune")


object empObj extends App {
  val emp = new LondonEmployee(10,"Ash")
  println(emp.location)
  val empP = new PuneEmployee(10,"Ish")
  println(empP)
  println(emp equals empP)
  println(emp == empP)
  println(emp != empP)


  val h =  Map("e" -> emp , "ep" -> empP)
  println(h.get("e") equals h.get("ep") )
  println(new PuneEmployee(10,"Ash") equals empP)
  println(new PuneEmployee(10,"Ish") equals h.get("ep").getOrElse(None) )
  println(new PuneEmployee(10,"Ish")  )
  println( h.get("ep") )
  println(new PuneEmployee(10,"Ish") equals h.get("ep1").getOrElse(None) )
  println( h.get("ep").getOrElse(None) equals new PuneEmployee(10,"Ash") )
}