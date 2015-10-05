# Collections

Scala provides a set of collection implementations that allow you to do a lot of cool stuff.  These collections are needed as a basis of functional programming.  There are two types of collections: Mutable and immutable.  A mutable collection can be updated or extended in plice, while immutable collections can never change.  Let's take a look at a few:


### Arrays

```scala

val v1 = Array(1,2,3,4,5,6)

```

This will create a standard array. We can access elements by doing something like:

```scala

v1(0) //returns 1

```
Arrays are mutable, therefore we can add and remove items from it.

### Lists

```scala

val v2 = List(1,2,3,4)


```

This will create a standard linked list.  It is mutable.  We can also create lists in the following way:

```scala

val v3 = 1 :: 2 :: 3 :: 4 :: Nil

```

Here we use the cons operator.  It is right associative.  This means that it will take Nil and append 1 and then 2 (ect).


### Sets

Sets are justs lists with **no duplicates** that are immutable:

```scala
val v4 = Set(1, 3, 2)
```

This will create an *immutable* set containing 1,3,2.


### Tuples

These are a heterogeneus bag of values that all retain their individual values:

```scala

val t1 = (4,"Alex", 3.14)

val t2 = "Alex" -> 3 // this also works

```

Now how do we access these individual elements?  


```scala
t1._1 = 4
t1._2 = "Alex"
t1._3 = 3.14
```

Although this is weird. We have this odd underscore thing, in addition to the counting starting at 1.


```scala

val (x,y,z) = t1

```

This will assign x,y,z to the tuple, respectively.  Weird fact:  We can have up to 22 tuples.  I have no idea what the significance of this is.


### Map

Maps are a set of key-value pairs, where all the keys are unique.

```scala

val capitals = Map("CA" -> "Sacramento", "MA" -> "Boston")


```

Cool, so we have some key-value pairs.  How do we access them?

```scala

capitals("CA")
//what if the key doesn't exist?
capitals("CT") //blows up!

// Let's be a bit safer

capitals.contains("CA") //true

```

We can also use the getOrElse method:

```scala

capitals.getOrElse("CA", "<unknown state>")
//Sacramento

```

