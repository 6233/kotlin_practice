fun main()
{
  operator fun Int.times(str : String) = str.repeat(this)
  println(2 * "bye ")

  operator fun String.get(range: IntRange) = substring(range)
  val str = "this is test, it is really test. so cool!"
  println(str[0..14])
}