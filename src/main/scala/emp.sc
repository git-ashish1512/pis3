case class Address(city:String, country:String)
case class Employee(name:String, addresses : List[Address])

val ashish = Employee("Ashish", List( Address("London","UK"),Address("Pune","India")) )
val emp2 = Employee("Emp2", List( Address("London","UK"),Address("Newyork","US")) )

val listofEmployess = List(ashish,emp2)

for (emp <- listofEmployess) {
  for (address <- emp.addresses
       if address.city == "Newyork") yield println(emp)
}


/*val listofEmplyeesinNewyork = for(emp <- listofEmployess
                                  address <- emp.
                                  if (emp.addresses. == "Newyork") ) yield emp
*/
//val listofEmplyeesinNewyork2 = listofEmployess.filter(emp => emp.address.city == "Newyork")

