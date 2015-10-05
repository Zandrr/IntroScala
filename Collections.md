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

