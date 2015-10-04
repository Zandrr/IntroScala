package com.example.factorial

//define Factorial as object so that it is a singleton.  This means that we
// have one and only one Factorial application.
object Factorial {
	def factorial(n: Int): Int = {
		if (n == 0 ) 1 else n * factorial(n-1)
	}
	def main(args: Array[String]): Unit = {
		val input = args(0).toInt
		println(input + "! = "+ factorial(input))
	}

}