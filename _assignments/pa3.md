---
layout: with-sidebar
index: 3
name: PA3
released-on: "2024-01-24"
---

# Programming Assignment 3

### Due Date: Wednesday, January 31, 8:00AM Pacific Time

## Learning Goals
- Practice writing classes and conditionals
- Do some open-ended exploration of Java features

## Collaboration

Different assignments in this course have different collaboration policies. On
this assignment, you can collaborate with anyone in the course, including
sharing code. In your submission, give credit to all students and course staff
who helped you with this assignment by noting their name and how you used their
ideas or work. Note that using someone's work without giving credit to them is a
violation of academic integrity.

# Starter Code

You can download the starter code for this assignment here:

[https://github.com/ucsd-cse11-w24/cse11-pa3-starter](https://github.com/ucsd-cse11-w24/cse11-pa3-starter)

# Start Early!

Start working on the assigment early. Even an hour a day can be very helpful to make sure you finish before the deadline.

## Submission Checklist

You should submit:

- [ ] `Drill1.java`
- [ ] `Drill2.java`
- [ ] `Drill3.java`
- [ ] `Drill4.java`
- [ ] `Open1A.java`
- [ ] Open1A output (txt, pdf or png)
- [ ] `Open1B.java`
- [ ] Open1B output (txt, pdf or png)
- [ ] `Open1C.java`
- [ ] Open1C output (txt, pdf or png)
- [ ] `ExamplesR.java`

## Task 1

### Drill 1 (autograded)
Write three classes as described below. They do not need to have any methods or constructors. Save them in the file ```Drill1.java```.

- A class named ```X``` with two fields, ```int f1``` and ```double f2```
- A class named ```Y``` with two fields, ```X field1``` and ```String field2```
- A class named ```Z``` with three fields, ```Y fieldY```, ```X fieldX```, ```double field3```

### Drill 2 (autograded)
In the file ```Drill2.java```, add the following class definitions (you can copy/paste them from here):

```java
class C1 {
  C2 other;
  C1(C2 other) {
    this.other = other;
  }
}

class C2 {
  int x;
  double y;
  C2(int x, double y) {
    this.x = x;
    this.y = y;
  }
}
```

Then add a class definition called ```Drill2``` with the following fields:

- A field named ```first``` of type ```C2``` with its ```x``` field equal to 10, and y field should be 3.5
- A field named ```second``` of type ```C1```. It’s value should be a reference to a ```C1``` object with its ```other``` field set to any ```C2``` object other than the one stored in ```first``` (you can create another ```C2``` object for this).
- A field named ```third``` of type ```C1```. It’s value should be a reference to a ```C1``` object with its ```other``` field the same ```C2``` object as the one stored in the ```first``` field.

### Drill 3 (autograded)
In the file ```Drill3.java```, write a class called ```VideoComment``` that has three fields: one field called ```text``` of type ```String```, one field called ```likes``` of type ```int```, and one field called ```replies``` of type ```int```. Give it a constructor of three arguments that initializes those fields. In it, write the following methods:

- ```hasMention``` which takes a ```String``` called ```username``` and checks if the string ```@``` followed by that username apppears in the Comment contents, returning ```true``` if it does and ```false``` otherwise. (There are some interesting cases for this method. For example, to check if we have the username “dummy” in “@dummy1 @dummy2”, hasMention() should return false in this case because username dummy1 and dummy2 is not the same as dummy, while “hello @dummy world” and “CSE 11 is a cool class @dummy” should return true)
- ```hasReply``` which takes no arguments and returns ```true``` if the comment has one or more replies, ```false``` otherwise.
- ```firstMention``` which takes no arguments and returns a ```String``` containing the substring between the first appearance of the ```@``` character in the ```text``` and the first space character after that. Do not include the ```@``` character and the space character. If there is no space after the ```@```, or if there’s no ```@```, then an empty string ```""``` should be returned.

(You may find some String methods in the [Java documentation](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/String.html#method.summary) useful)

Also in ```Drill3.java```, write a class called ```CommentReply``` that has four fields: one called ```replyTo``` of type ```VideoComment```, one called ```text``` of type ```String```, one called ```likes``` of type ```int```, and one field called ```replies``` of type ```int```. Give it a constructor of four arguments that initializes these fields. In it, write the following methods:

- ```morePopularReply``` which takes no arguments and returns true if this CommentReply has more likes than the VideoComment it is replying to
- ```allLikes``` which takes no arguments and returns the sum of the likes on this CommentReply and on the VideoComment it is replying to
- ```hasMention``` which takes a ```String``` called ```username``` and checks if the string ```@``` followed by that username apppears in this ```CommentReply```’s contents or in the ```VideoComment``` that is being replied to.

We highly recommend adding a class to this file called ```Drill3``` that has any tests or examples you used to help verify that your methods worked as you expected.

### Drill 4 (autograded)
In a file called ```Drill4.java```, write a class ```Drill4``` with the following methods (you may find some Math methods in the [Java documentation](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Math.html#method.summary) useful): 

- ```phaseOfWater``` which takes an ```int``` and returns ```"vapor"``` if the number is greater than or equal to 100, ```"liquid"``` if the number is less than 100 and greater than 0, and ```"solid"``` if the number is less than or equal to 0.
- ```maxProduct``` which takes three ```ints``` and returns the largest product between any two of them. For example, ```maxProduct``` applied to 1, -4, and -5 should return 20 because the product between -4 and -5 is -5 which is greater than the product of 1 and -5 (Product: -5), as well as 1 and -4 (Product: -4) 
- ```pipeVolume``` which takes three ```double```s representing the inner radius of a cylindrical pipe, and the outer radius, as well as the height of the pipe. It returns the volume of the pipe as a ```double```. Assume both inputs are positive and that the first number is smaller than the second (inner radius always smaller). Recall that the volume of a cylinder is πr<sup>2</sup>h. You can use ```Math.PI```, a field conveniently defined for us by Java, as a constant for the value of π.

In addition, you must write at least three interesting tests for **each** method above, and include the expected values. You can test them in the same way as we did in class and previous two PAs. You can use the tester package if you want, but we’re not grading for it. In PA4 we will explicitly require it in some cases to make sure everyone gets practice with it.

## Task 2

### Open-Ended 1 (manually graded)
Consider the following statements about Java programs:

- **Statement A**: In Java, two different classes can define a field with the same name and type.
- **Statement B**: In Java, one class can define two fields with the same name as long as they have different types.
- **Statement C**: In Java, two different methods in the same class can have the same parameter name, and arguments passed to one of those methods don’t affect the parameter in the other.

For each statement, write a small Java program that demonstrates whether it is true or false. In the programs you should define some classes that reflect the statements. You can choose whatever names you want for the classes. Put the class definitions in the files ```Open1A.java```, ```Open1B.java```, and ```Open1C.java```. Inside the files, you should also include an ```Open1A```/```Open1B```/```Open1C``` class with some instances of the classes you just create.

To show that a statement is true, write a Java program that matches the statement, doesn’t produce an error when run, and produces some meaningful output when ```./run```.

To show that a statement is false, write a Java program that matches the statement and produces an error when run, demonstrating that Java programs cannot do what the property says.

Include both the program and the output of running the program as your submission; you can upload screenshots as images clearly named with ```Open1A```, ```Open1B```, etc in the title, or copy-paste the text output into a comment in your code.

### Open-Ended 2 (manually graded)
Create a class named ```R``` that has a field of type ```String``` and a field of type ```R```. Give it a constructor that initializes both fields. Put the class in a file called ```ExamplesR.java```. Add an ```ExamplesR``` class to this file, and answer the following questions in that file:

1. Construct an example ```R``` object. Were you able to? Explain your example if you were able to, and explain why you think it’s not possible if you weren’t.
2. On YouTube, it’s possible to reply to a reply to a Comment (that’s not a typo, it’s a reply to a reply). This is true of many systems, like email, Facebook comments, Piazza followups, and so on. With the class structure in ```Drill3``` with ```VideoComment``` and ```CommentReply``` (that is, without changing the fields as described above), could you construct an example of a reply to a reply to a Comment? Why or why not?

## Submission
You will submit all of your files to the ```pa3``` assignment on Gradescope:

- On the Gradescope upload screen, you can keep clicking “Browse Files” to select more than one file for your upload; you can select them one at a time or use your operating system’s multi-select (Shift-Click usually works) to select them all and drag them onto the upload area, or other options that you find that work.
- You can also make a zip archive of all of your files and upload them all at once if you prefer.

The parts marked ```autograded``` will be graded automatically in Gradescope based on tests we wrote. The parts marked ```manually graded``` will be graded by the course staff after the due date. 
