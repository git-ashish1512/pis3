package chap14

import org.scalatest.{BeforeAndAfterEach, FunSuite}

/**
  * Created by adwivedi on 16/12/16.
  */
class EmployeeTest extends FunSuite with BeforeAndAfterEach {

  val emp = new LondonEmployee(10,"Ash")
  val empP = new PuneEmployee(10,"Ish")
  val h =  Map("e" -> emp , "ep" -> empP)

  test("testLocation") {
    assertResult("Pune") {
      empP.location
    }
    assertResult("London") {
      emp.location
    }
  }

  test("testName") {
    assertResult("Ish") {
      empP.name
    }
    assertResult("Ash") {
      emp.name
    }

  }

  test("testToString") {
    assert{!(emp.toString isEmpty)}

  }

  test("testHashCode") {

  }

  test("testId") {

  }

  test("testEquals") {

  }

  test("testCanEqual") {

  }

}
