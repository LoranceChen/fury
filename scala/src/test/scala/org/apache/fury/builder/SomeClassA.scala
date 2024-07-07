package org.apache.fury.builder

case class SomeClassA(v: String, x:Int=10000)
case class SomeClassB(x: String, y:Int=10000,z: Boolean = true)
case class SomeClassC(x: String, z:Boolean, y: Int = 10000)

case class SomeClassE(var a: Int, var b: String, x: String, y:SomeClassB=SomeClassB("default b", 1001),z: Boolean = true, j: () => Unit = () => {println("hello")}) {

}


case class SomeClassD(var a: Int, var b: String, x: String, y:Int=10000,z: Boolean, var c: String, private var d: Boolean) {
  private var e: Int = 10000
  private val f: Boolean = true
  private var g: Object = null
  private var h: Object = new Object()
}

