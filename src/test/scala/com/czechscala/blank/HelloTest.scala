package com.czechscala.blank

import org.scalatest.FunSuite
 
class HelloTest extends FunSuite {
 
  test("world is greeted properly") {
    assert(Hello.sayHello === "Hello World!")
  }

}
