# Tutorial 7 notes

Things to note:
* Today's lab is for marking milestone 1. 
* This will be done on MS Teams (Make sure you download it)
* Week 5's Lab will be marked in week 9 but make sure you submit it.
* Today we will cover the decorator pattern (not in lectures until next week but very useful for the project)

---

## Q1 - Given the following problems, which patterns covered in this course might be appropriate to solve them?

<br>

### Sorting collections of records in different orders.

<details>

Strategy pattern. This what Java does with the Collections.sort() method. A Comparator can be provided to determine the order in which elements are sorted.

<summary>Answer</summary>

</details>

<br>

---

### Modelling a file system

<details>

Composite pattern. Both folders and files are filesystem entries. Files form the leaves, folders can contain files or other folders.

<summary>Answer</summary>

</details>

<br>

---

### Updating a UI component when the state of a program changes.

<details>

Observer pattern. If the state of the program is the subject and the UI an observer, the UI will be notified of any changes to the state and update accordingly.

<summary>Answer</summary>

</details>

<br>

---

### Parsing and evaluating arithmetic expressions.

<details>

Composite pattern. The composite pattern can be used to represent a parse-tree. An example of this is given in the code.

<summary>Answer</summary>

</details>

<br>

---

### Adjusting the brightness of a screen based on a light sensor.

<details>

Observer pattern. If the light sensor is the subject, the observer could be notified on all significant changes to the amount of light hitting the sensor and adjust the brightness of the screen accordingly.

<summary>Answer</summary>

</details>

<br>

---

## Q2 - Model the following system

A player can wear any combination of pieces of armour:
- Helmet
- Leggings
- Chestplate
- Boots

<br>

---

## Q3 - When should we use Composite vs. Decorator?

<details>

Composite is better when we have multiple instance objects that can be combined in different ways (e.g. for math numbers can be combined in multiple ways: add, subtract, multiply).

Decorator is better when we have one instance object which we would like to modify the behaviour of (e.g. a christmas tree with multiple decorations).

<summary>Answer</summary>

</details>