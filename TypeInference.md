# Type Inference 

### Basic Type Inferebce

We can make explicit declarations:


```scala

val n: Int = 4

val s: String = "Yup!"

```

But in many cases we can just omit the type, our compiler will figure it out:

```scala

val n = 4

val s = "Uh huh!"

```

Since Scala is statically typed, the compiler has to infer the appropriate types of s and n.  They are inferred from the types of the expressions on the right side of the assignments.


So we can even do stuff like this:

```scala

import scala.util.Random._

val n = if(nextInt()%2 == 0) 1 else 0

val s = if(nextInt()%2 == 0) "Even!" else "Odd!"

```

But what if the types of the expressions of the right side of the assignment aren't the same?

```scala

val whatHappens = if(nextInt()%2 == 0) "Even!" else 0

val whatHappens2 = if(nextInt()%2 == 0) false else 0

```

As you probably know, Scala is compiled into java byte code on the JVM.  This means that type promotion that occurs in complition in java is similar in Scala.  For example, if we try to ad a Byte to a Double, the JVM will promote the Byte to a Double, do the addition and return a Double. 


In Scala there is one major difference.  Every value type (Boolean, Double, Int, Float, String ect) has the common ancesor of type AnyVal.  Although we can't do much with these AnyVals, because they have no member functions.  Ideally we want to write code that does not produce any AnyVals. 


There is something similar for object types in scala.  The common ancestor is called AnyRef, which is equivalent to java's object type.  All objects inheret from AnyRef.


Both AnyRef and AnyVal inheret from the Any type.  Although Any has some member functions that can be used for type checking, casting, and equality.


```scala

val whatHappens = if(nextInt()%2 == 0) "Even!" else 42
//whatHappens: Any = 42
```

So the common ancestor is type Any.  Let's try to do some stuff with Any.

```scala
val whatHappens = if(nextInt()%2 == 0) "Even!" else 42
//whatHappens: Any = 42

whatHappens * 5 //error: value * is not a member of Any
```

We can't treat our val as type int.  It's type Any which does not have a member function "*".  How can we fix this?


```scala

val whatHappens = if(nextInt()%2 == 0) "Even!" else 42

whatHappens.isInstanceOf[String] // False

whatHappens.isInstanceOf[Int] // True!

val asInt = whatHappens.asInstanceOf[Int]

asInt * 5 // 210!
```

So we checked what type is was, and then casted it as an Int.  We can now interact with our new val as an Int.  We'll see later on that this is not something we want to do often.

