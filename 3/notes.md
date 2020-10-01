# Week 3 Tutorial

Today we will cover:
- Access Modifiers
- UML
- Quick intro to abstract classes and interfaces
- Kahoot?

<br>

---

## What are access modifiers and why do we use them?

<details>

<img src="images/access.png" width=500/>

</details>

<br>

---

## Lets investigate the java code that is given.

<br>

### What is UML? 

<details>

Unified Modelling Language - it is used to show the internal structure of our object oriented system.

<summary>Answer</summary>

</details>

<br>

### Lets turn the existing code into UML.

<details>

<img src="images/uml+-.PNG" width=500/>

<summary>Answer</summary>

</details>

<br>

### What are associations, aggregations, and composition relationships?

<details>

They are all relationships betwen different classes

Association is the weakest, it implies one class uses the other but isnt strong enough a link to be one of the other relationships.

Aggregation implies that both classes can exist with or without one another.

Composition implies that the owned class cannot exist without the owning class.

<summary>Answer</summary>

</details>

<br>

### What are cardinalities/multiplicities?

<details>

Cardinalities are used to say how many of each object instances exist in the relationship.

<summary>Answer

</details>

<br>

### What is an abstract class? Can we update the given code to use abstract classes?

<details>

Just like a class is a blueprint for an object, an abstract class is a blueprint for a class

<summary>Answer</summary>

</details>

<br>

---

## What is an interface? How do they compare to abstract and concrete classes?

### Which have state?

<details>

| Interface     | Abstract Class  | Concrete Class  |
| ------------- |---------------| ----------------|
| No     | Yes | Yes |

<summary>Answer</summary>

</details>

<br>

### Which have functionality?

<details>

| Interface     | Abstract Class  | Concrete Class  |
| ------------- |---------------| ----------------|
| Yes     | Yes | Yes |

<summary>Answer</summary>

</details>

<br>

### Which are instantiable?

<details>

| Interface     | Abstract Class  | Concrete Class  |
| ------------- |---------------| ----------------|
| No     | No | Yes |

<summary>Answer</summary>

</details>

<br>

---

## Define the following terms:

### Coupling

<details>

Coupling is the degree to which one piece of code depends on the internal workings of another piece of code.

<summary>Answer<summary>

</details>

<br>

### Cohesion

<details>

Cohesion is the degree to which two bits of code/systems work together as one unit.

<summary>Answer<summary>

</details>

<br>

### Refactoring

<details>

Refactoring is the process of modifying the internal working of a system without changing the external behaviour. By definition this is easier to do with a lowly coupled system.

<summary>Answer<summary>

</details>

<br>

### Overloading

<details>

When two methods have the same name but different arguments that are passed in and thus different implementations.

<summary>Answer<summary>

</details>

<br>