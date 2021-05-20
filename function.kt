fun printMessage(message: String) : Unit {
  println(message)
}
fun printMessageWithPrefix(message: String, prefix: String = "info") {
  println("[$prefix] $message")
}
fun sum(x: Int, y: Int) : Int {
  return x + y
}
fun multiply(x: Int, y: Int) = x * y      // single expression

fun main()
{
  printMessage("Hello")
  printMessageWithPrefix("Hello", "test")
  printMessageWithPrefix("Hello")
  printMessageWithPrefix(prefix = "Log", message = "Hello")
  println(sum(1,2))
  println(multiply(2,4))
}