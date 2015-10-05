# Example 2: Doing factorial in scala


 It's pretty simple really:

 ```scala

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

 ```

 We write a recursive function *factorial* that takes one parameter *n*.  We use our expressions to make this scala-y. First we check our edge case: If n is 0, then we're done.  In all other cases return the result of the expression that is evaluated from n * factorial(n-1). For those of you unfamiliar with recursion, it looks something like this.


 ```bash

factorial(5)
5*(factorial(4))
5*(4*(factorial(3)))
5*(4*(3*(factorial(2))))
5*(4*(3*(2*(factorial(1))))))

 ```

We build up this expression to be evaluated at the very end.