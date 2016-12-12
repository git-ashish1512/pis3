/**
  * Created by adwivedi on 11/12/16.
  */

case class Address(city:String, country:String)
case class Employee(name:String, addresses : List[Address])


object Emps extends App{

  val ashish = Employee("Ashish", List( Address("London","UK"),Address("Pune","India")) )
  val emp2 = Employee("Emp2", List( Address("London","UK"),Address("Newyork","US")) )
  val listofEmployess = List(ashish,emp2)
  println(listofEmployess)

  for (emp <- listofEmployess) yield println(emp.addresses)

  def filterEmployees (city:String): List[Employee]={
    for (emp <- listofEmployess) {
      for (address <- (emp.addresses)
           if address.city == city) yield println("inside filter: " + emp)
    }
  }

  val listofEmployeesinNewyork = filterEmployees("Newyork")
  println(listofEmployeesinNewyork)
}
