open class Dog {  // if you want to allow the calss inheritance, mark the class with the `open` modifier.
  infix fun Int.times(str: String) = str.repeat(this)
  open fun sayHello() {
      println(2 times "wow ")   
  }
}

class Yorkshire : Dog() {
  override fun sayHello() {
      println(2 times "wif ")
  }
}

fun main() {
  val dog: Dog = Yorkshire()
  dog.sayHello()
}

