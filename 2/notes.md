# Week 2 Tutorial

Today we will be covering:
* Classes and Subclasses
* Access Modifiers
* toString() and equals()

---

## Q1a - Write a Shape class. What properties does a shape have?

<br>

## Q1b - Write the toString() method of Shape.

<br>

## Q1c - How do we compare if two objects are equal?

<details>

All objects in java are references and java is pass by reference for everything except primatives (int, double, float ...).

Therefore doing == on two objects test if they are literally the same object rather than that the two objects have the same properties

<summary>Answer</summary>

</details>

<br>

## Q1d - Write the equals() method.

<details>

https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)

<summary>Note</summary>

</details>

<br>

## Q1e - How can we count the number of Shape's created?

<br>

## Terminology check: What is a superclass and a subclass?

<br>

## Q1f - Write a Rectangle class that is a subclass of Shape.

<details>

> If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass. If the super class does not have a no-argument constructor, you will get a compile-time error. Object does have such a constructor, so if Object is the only superclass, there is no problem. Source: http://docs.oracle.com/javase/tutorial/java/IandI/super.html 

<summary>Note</summary>

</details>

<br>

---

## Q2 - What are access modifiers in Java? 

<details>

![Access](images/access.png)

<summary>Answer</details>

</details>