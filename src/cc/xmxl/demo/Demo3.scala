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

object Demo3 {
  def main(args: Array[String]) {
    var pet: Friendly = new Dog
    println(pet.greet())

    pet = new HungryDog
    println(pet.greet())

    pet = new Dog with ExclamatoryGreeter
    println(pet.greet())

    pet = new HungryDog with ExclamatoryGreeter
    println(pet.greet())
  }
}

trait Friendly {
  def greet() = "Hi"
}

class Dog extends Friendly {
  override def greet() = "Woof"
}

class HungryDog extends Dog {
  override def greet() = "I'd like to eat my own dog food"
}

trait ExclamatoryGreeter extends Friendly {
  override def greet() = super.greet() + "!"
}

