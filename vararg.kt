fun main()
{
  fun printAll(vararg messages: String) {
    for (m in messages) println(m)
  }
  printAll("ga","na","da","ra","你好")

  fun printAllWithprefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
  }

  printAllWithprefix("ga","na","da","ra","你好" , prefix = "Greeting: ")

  fun log(vararg entries: String) {
    printAll(*entries)
  }
  log("ga", "na", "da", "ra", "你好")

}