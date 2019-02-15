package com.aikq.space.base

/**
  * E
  *
  * @author aikq
  * @date 2019年02月15日 11:03
  */
class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("x 的坐标点: " + x)
    println ("y 的坐标点: " + y)
  }
}

class Location(xc: Int, yc: Int, val zc :Int) extends Point(xc, yc){
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("x 的坐标点 : " + x);
    println ("y 的坐标点 : " + y);
    println ("z 的坐标点 : " + z);
  }
}

object Test{
  def main(args: Array[String]): Unit = {
    val p = new Point(10, 20)
    p.move(10, 10)
  }
}

object Test2{
  def main(args: Array[String]): Unit = {
    val p = new Location(10, 10, 10)
    p.move(10, 10, 10)
  }
}
