package todo

import org.scalatest.funsuite.AnyFunSuite

class Test extends AnyFunSuite:
  val x = MyClass();
  test("An empty Set should have size 0") {
    assert(x.getValue == 999)
  }

  test("an test that fail") {
    assert(x.getValue == 9)
  }
