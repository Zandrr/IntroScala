# Pattern Matching!

The old, terrible way:

```scala

def getStringFromNum(n: Int): String = {
	if (n == 0) "Zero"
	else if (n == 1) "One"
	else if (n == 2) "Two"
	else "I can only count to two..."
}

```

In scala we can do this thing called matching:

```scala

def getStringFromNum(n: Int): String = n match {
	case 0 => "Zero"
	case 1 => "One"
	case 2 => "Two"
}

```

This seems pretty close to a switch-case statement.  The difference is that we don't need a break statement.  What if we want multiple cases to coorespond to a single output?


```scala
def daysInMonth(n: Int): Int = n match {
	case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
	case 4 | 6 | 9 | 11 => 30
	case 2 => 28
}
```

What if we want multiple types in the same switch statement?


```scala
def whatAmI(t: Any): String = t match {
	case n: Int => "I'm and integer!"
	case b: Boolean => "I'm a boolean!"
	case s: String => "I'm a string!"
	case _ => "I don't know what I am :("
}


```

### Exception Handling

The following code may break:


```scala

import util.Random._

val s = if(nextBoolean()) "42" else "Wowzer!"
val n = s.toInt

```
We may get an error here if we don't return "42".  Let's write some code to check for this exception.


```scala

def toIntException(s: String): Int = try {
  s.toInt
} catch {
  case _: NumberFormatException => 0
}

```

In this case we try to convert s to an int.  If we cannot, we return an exception using our "_" everything case matcher.