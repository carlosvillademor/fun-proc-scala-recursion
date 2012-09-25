package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  import Main.countChange
  test("example from instructions") {
    //assert(countChange(4,List(1,2)) === 3)
  }

  test("sorted CHF") {
    //assert(countChange(300,List(5,10,20,50,100,200,500)) === 1022)
  }

  test("no pennies") {
    //assert(countChange(301,List(5,10,20,50,100,200,500)) === 0)
  }

  test("unsorted CHF") {
    //assert(countChange(300,List(500,5,50,100,20,200,10)) === 1022)
  }

  test("Change for 0") {
    assert(countChange(0,List(500,5,50,100,20,200,10)) === 0)
  }

  test("Change for some amount when there are no coins") {
    assert(countChange(30,List()) === 0)
  }

}