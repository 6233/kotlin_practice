# kotlin_practice

코틀린을 연습해보자.


Install the compiler﻿
Manual install﻿
Unzip the standalone compiler into a directory and optionally add the bin directory to the system path. The bin directory contains the scripts needed to compile and run Kotlin on Windows, OS X and Linux.

SDKMAN!﻿
An easier way to install Kotlin on UNIX-based systems such as OS X, Linux, Cygwin, FreeBSD, and Solaris is SDKMAN!. It also works in Bash and ZSH shells.

To install SDKMAN!, run the following command in a terminal and follow any instructions:

$ curl -s https://get.sdkman.io | bash
Copied!
Next, open a new terminal and install Kotlin with:

$ sdk install kotlin
Copied!
Homebrew﻿
Alternatively, on OS X you can install the compiler via Homebrew.

$ brew update
$ brew install kotlin
Copied!
Snap package﻿
If you use Snap on Ubuntu 16.04 or later, you can install the compiler from the command line:

$ sudo snap install --classic kotlin
Copied!
Create and run an application﻿
Create a simple application in Kotlin that displays "Hello, World!". In your favorite editor, create a new file called hello.kt with the following lines:

fun main() {
    println("Hello, World!")
}
Copied!
Compile the application using the Kotlin compiler:

$ kotlinc hello.kt -include-runtime -d hello.jar
Copied!
The -d option indicates the output path for generated class files, which may be either a directory or a .jar file. The -include-runtime option makes the resulting .jar file self-contained and runnable by including the Kotlin runtime library in it.

To see all available options, run

$ kotlinc -help
Copied!
Run the application.

$ java -jar hello.jar
Copied!
Compile a library﻿
If you're developing a library to be used by other Kotlin applications, you can build the .jar file without including the Kotlin runtime into it.

$ kotlinc hello.kt -d hello.jar
Copied!
Since binaries compiled this way depend on the Kotlin runtime you should make sure the latter is present in the classpath whenever your compiled library is used.

You can also use the kotlin script to run binaries produced by the Kotlin compiler:

$ kotlin -classpath hello.jar HelloKt
Copied!
HelloKt is the main class name that the Kotlin compiler generates for the file named hello.kt.

Run the REPL﻿
You can run the compiler without parameters to have an interactive shell. In this shell, you can type any valid Kotlin code and see the results.

Shell
Run scripts﻿
Kotlin can also be used as a scripting language. A script is a Kotlin source file (.kts) with top-level executable code.

import java.io.File

// Get the passed in path, i.e. "-d some/path" or use the current path.
val path = if (args.contains("-d")) args[1 + args.indexOf("-d")]
           else "."

val folders = File(path).listFiles { file -> file.isDirectory() }
folders?.forEach { folder -> println(folder) }
Copied!
To run a script, we just pass the -script option to the compiler with the corresponding script file.

$ kotlinc -script list_folders.kts -- -d <path_to_folder_to_inspect>
Copied!
Since 1.3.0, Kotlin has an experimental support for scripts customization, such as adding external properties, providing static or dynamic dependencies, and so on. Customizations are defined by so-called Script definitions- annotated kotlin classes with appropriate support code. The script filename extension is used to select appropriate definition.

Properly prepared script definitions are detected and applied automatically when the appropriate jars are included in the compilation classpath. Alternatively, you can specify definitions manually using -script-templates option to the compiler:

$ kotlinc -script-templates org.example.CustomScriptDefinition -script custom.script1.kts
