# Tutorial 4 notes

Note: no exercise this week

Today we will cover:

* Interfaces
* Law of Demeter
* Liskov Substitution Principle
* Strategy Pattern

---

## Law of Demeter

In abstract terms:

* Each unit should have only limited knowledge about other units: only units "closely" related to the current unit.
* Each unit should only talk to its friends; don't talk to strangers.
* Only talk to your immediate friends.

In object oriented specific terms this amounts to:

A method `m` of an object `o` may only invoke the methods of the following kinds of objects:

* `o` itself;
* `m`'s parameters;
* any objects instantiated within `m`;
* `o`'s attributes;
* global variables accessible by `o` in the scope of `m`.

What does this mean we cant do?

<details>

* Call methods of returned objects

As an analogy, when one wants a dog to walk, one does not command the dog's legs to walk directly; instead one commands the dog which then commands its own legs.

We should aim to add wrapper methods.

### Pros:

* Shorter more logical method calls.
* Higher cohesion
* Lower coupling

### Cons:

* Over use of wrapper methods

<summary>Answer</details>

</details>

<br>

---

## Liskov substitution principle

if `S` is a subtype of `T`, then objects of type `T` may be replaced with objects of type `S`

<details>

Not something to worry about in java too much as it already has inbuilt safeguards, for example:

* You cant undefine methods in subclasses
* You cant change return type of methods in subclasses

<summary>Answer</summary>

</details>

<br>

---

## How can we model Ducks using inheritance?

What are the pros and cons of this approach?

<details>

### Pros

* Simple

### Cons

* Violates DRY (Dont repeat yourself)
* Introduces refused bequest
* Partially violates Liskov substitution principle

<image src="images/liskov.jpg" />

<summary>Answer</details>

</details>

<br>
<br>
<br>
<br>

---

## How can we model Ducks using inheritance and interfaces?

What are the pros/cons of this approach?

<details>

### Pros

* No more refused bequest


### Cons

* Violates DRY (Dont repeat yourself)
* How many ducks are there? What if a large proportion of them fly the same way but only a few vary. How many times are we going to have to repeat ourselves?
* Doesnt adhere to OO design principles 

<summary>Answer</summary>

</details>

<br>
<br>
<br>
<br>

---

## How can we model Ducks using inheritance, interfaces, and the strategy pattern?

Lets think about how we could use the following OO design principles to improve on our code:

* Encapsulate what varies
* Favour composition over inheritance
* Program to interfaces not implementations

What are the pros/cons of this approach?

<details>

### Pros

* Dynamic swapping of algorithm
* DRY compliant

</details>

<br>
<br>
<br>
<br>


The strategy pattern part of this tutorial is heavily influenced by Head First Design https://www.oreilly.com/library/view/head-first-design/0596007124/ch01.html 