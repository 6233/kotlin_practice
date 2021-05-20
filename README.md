# kotlin_practice

코틀린을 연습해보자.


# Install the compiler
 1. $ curl -s https://get.sdkman.io | bash
 2. open a new terminal
 3. $ sdk install kotlin    

# Compile and Run
 1. $ kotlinc hello.kt -include-runtime -d hello.jar
 2. $ java -jar hello.jar

# Compile a library
 1. $ kotlinc hello.kt -d hello.jar

# kotlin script
 1. $ kotlin -classpath hello.jar HelloKt
 * `HelloKt` is the main class name that Kotlin compiler generates for the file named hello.kt

from https://kotlinlang.org/docs/command-line.html
