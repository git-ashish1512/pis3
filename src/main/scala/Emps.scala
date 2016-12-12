/**
  * Created by adwivedi on 11/12/16.
  */

case class Address(city:String, country:String)
case class Employee(name:String, addresses : List[Address])


object Emps extends App {

  val ashish = Employee("Ashish", List(Address("London", "UK"), Address("Pune", "India")))
  val emp2 = Employee("Emp2", List(Address("London", "UK"), Address("Newyork", "US")))
  val emp3 = Employee("Emp3", List())

  val listofEmployess = List(ashish,emp2, emp3)
  //println(listofEmployess)

  //for (emp <- listofEmployess) yield println(emp.addresses)

  println ( "using filter: " + listofEmployess.filter(emp => emp.addresses.filter(address => address.city == "Newyork").size != 0) )

  def findEmployees(city: String): List[Employee] = {
    for (emp <- listofEmployess
         if (emp.addresses.filter(address => address.city == city).size != 0)) yield  emp
  }

  val listofEmployeesinPune = findEmployees("Pune")
  println("Employees in Pune are : " + listofEmployeesinPune)
  val listofEmployeesinNewyork = findEmployees("Newyork")
  println("Employees in Newyork are : " + listofEmployeesinNewyork)



}