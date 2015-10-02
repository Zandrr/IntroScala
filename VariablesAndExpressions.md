# Variables and Expressions

### Mutable Variables

A mutable variable in Scala is one that is defined using the keyword: ***var***

```scala

var i: Int = 5

```

This can be read as:  "Hey Scala, create a variable named i that has type Int and an initial value of 5."  We won't usually need to be this verbose, in general the Scala compiler is really good at figuring out what type 5 is (Int).


Like I said, vars are *mutable* so we can change its value:

```scala

i = 10 //No problems here!

```

Let's try out some other types.  How about booleans and Strings?

```scala

i = true //error: type mismatch;

i = "Coffee!" //error: type mismatch;
```

It turns out that Scala is strongly typed.  This means that it's illegal to assign an Int to a Boolean, an Int to a String, or any combination of these.  In addition, Scala is statically typed.  In other words, type is checked at compile time, not run time.

### Immutable Values

An immutable value is a value defined using the keyword: ***val***.  These values cannot be changed. Ever.  They're like final in Java or const is C.

```scala

val p: String = "p will always be this string"
p = "CHANGE!" //error: reassignment to val

```

As we'll see when we jump into expressions, we'll see why in Scala we will mostly be using vals instead of vars.

### Expressions vs Statements


Imperative programming such as most procedural languages are all about sequential execution of **statements**.  The effect of these statements change the system's state.  I.e. Changing a variables value based on certain control flow statements.

```scala

//isEven?

import util.Random._ 

var n:Int = nextInt() // we got this nextInt() thing from util.Random

if(n%2 == 0) {
	n = true
	println("It's even!")
} else {
	n = false
	println("It's odd!")
}


```

This is essentially how most people think about control flow structures in imperative languages. They are statements that are procedurally executed. In Scala, it's convention to use control flow structures as expressions.

```scala

import util.Random._

val n = if(nextInt() % 2 == 0) n = true else n = false

```

In both cases n is of type Boolean, so the if-else expression will also be type Boolean.  We can use block expressions to keep our print statements:

```scala
import util.Random._

val n =
	if(nextInt()%2 == 0){
		println("It's even!")
		n = true
	} else {
		println("It's odd!")
		n = false
	}

```

So in Scala we use expressions, not statements!


