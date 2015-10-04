# Example 1: "Hello, World!"


Let's write our first scala program, woo!


First we need to create a build.sbt file.  This file will allow us to build and run our scala project.

```

name := "factorial"

version := "0.1"

scalaVersion := "2.10.5"

```
The name of our project is "factorial".  Our version is "0.1". Compile our code on the JVM using scala version "2.10.5".  That's all we need!


Next let's create a directory structure so that scala knows where our code is.  

```bash
mkdir -p src/main/scala/com/example/factorial

```

We're going to write a factorial calculator!


But first let's do a little hello world application.

```scala


package com.example.factorial

//define Factorial as object so that it is a singleton.  This means that we
// have one and only one Factorial application.
object Factorial {
	def main(args: Array[String]): Unit = {
		println("Hello, world!")
	}

}

```


Awesome, now in the root directory, run:

```bash
sbt run
```

Okay let's spice it up a bit.  How about a command line argument:


```scala


package com.example.factorial

//define Factorial as object so that it is a singleton.  This means that we
// have one and only one Factorial application.
object Factorial {
	def main(args: Array[String]): Unit = {
		val name = args(0)
		println("Hello, " + name)
	}

}

```


This time when we run it we need to do the following:


```bash

sbt "run Alex"

```