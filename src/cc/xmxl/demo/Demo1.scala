/**
 * Copyright 2015 xmxl.cc.
 * @Description: TODO
 * @author 吴小平
 * @date Nov 4, 2015 10:06:15 AM
 *
 */
package cc.xmxl.demo

/**
 * @author Administrator
 *
 */
object Demo1 {
  def main(args: Array[String]) {
    //定义函数，函数参数要指定类型签名
    def square(a: Int) = a * a
    def squareWithBlock(a: Int) = {
      a * a
    }
    //定义匿名函数，匿名函数由参数列表，箭头连接符和函数体组成
    val squareVal = (a: Int) => a * a
    def addOne(f: Int => Int, arg: Int) = f(arg) + 1

    println("hello world!")
    //多行文本
    println("""the present string
spans three
lines.""")
    println("square(2):" + square(2))
    println("squareWithBlock(2):" + squareWithBlock(2))
    println("squareVal(2):" + squareVal(2))
    println("addOne(squareVal,3):" + addOne(squareVal, 3))
  }

}