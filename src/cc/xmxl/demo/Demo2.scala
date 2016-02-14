/**
 * Copyright 2010-2015 epweike.com.
 * @Description: TODO
 * @author 吴小平
 * @date Feb 14, 2016 2:07:46 PM
 *
 */
package cc.xmxl.demo

/**
 * @author Administrator
 *
 */

object Demo2{
   def main(args: Array[String]) {
    val demo = new Demo2("HP")
    println(demo.color+demo.add(2, 3));
  }
}

class Demo2(brand: String) {
  /**
   * A constructor.
   */
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

  // An instance method.
  def add(m: Int, n: Int): Int = m + n

}

