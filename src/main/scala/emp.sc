case class Address(city:String, country:String)
case class Employee(name:String, addresses : List[Address])

val ashish = Employee("Ashish", List( Address("London","UK"),Address("Pune","India")) )
val emp2 = Employee("Emp2", List( Address("London","UK"),Address("Newyork","US")) )
val emp3 = Employee("Emp3", List())

val listofEmployess = List(ashish,emp2, emp3)

listofEmployess.filter(emp => emp.addresses.filter(address => address.city == "Newyork").size != 0)

listofEmployess.filter(emp => emp.addresses.exists(address => address.city == "Pune"))


listofEmployess.filter(_.addresses.exists(_.city=="Pune"))