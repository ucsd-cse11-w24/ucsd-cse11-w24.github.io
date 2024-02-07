---
layout: with-sidebar
index: 5
name: PA5
released-on: "2024-02-07"
---

# Programming Assignment 5

### Due Date: Wednesday, February 14, 8:00AM Pacific Time

## Learning Goals
- Debug runtime errors of the code that handles a String array.
- Practice writing methods that calculate values from arrays using loops.

## Collaboration
Different assignments in this course have different collaboration policies. On this assignment, you can collaborate with anyone in the course, including sharing code. In your submission, give credit to all students and course staff who helped you with this assignment by noting their name and how you used their ideas or work. Note that using someone's work without giving credit to them is a violation of academic integrity.

# Starter Code

You can get the starter code at

[https://github.com/ucsd-cse11-w24/cse11-pa5-starter](https://github.com/ucsd-cse11-w24/cse11-pa5-starter)

Not all files have been provided for you. If you do not see the java file, you will need to make a new one on your own.

## Debug Runtime Errors
In the starter code, a file named ```Debug.java``` is given. The class `Debug` has a main method. This method has to take a `String` array as its parameter from the command line, consider the initial argument of the array as a keyword, and print the number of occurrences that the keyword appears in the rest of the array. The code has several runtime errors. Fix the errors so that the code satisfies the following:
1. If the input array is empty, then the output should print `No keyword is given`
2. If the input array is not empty, the initial argument should be a keyword with the prefix `--` (two dashes). If the argument does not satisfy this format, then the output should print `Write a keyword with the prefix --`
3. If the input array is not empty and the keyword is given in the correct format, then calculate the count of occurrences of the keyword after the initial argument. If the array has only one `String`, then the count is 0. The output should print `The answer is [count]`

Examples:

```
$ javac Debug.java   
$ java Debug   
No keyword is given   
$ java Debug melon   
Write a keyword with the prefix --   
$ java Debug --melon   
The answer is 0   
$ java Debug --melon apple orange melon watermelon melon banana   
The answer is 2   
```

We can use `System.out.println()` method to debug runtime errors. The lines 3, 7, 10, 12 (comments starting with `//`) in `Debug.java` are provided to help you debug the code. You may remove `//` and check the output of these method calls. These will print out some information about parameters or variables. We can see what values are assigned to those during execution, which makes debugging easier. Remember to put `//` back before submission.

## Array Methods
In a file called ```ArrayExamples.java```, write the following methods in a class called ```ArrayExamples```. For **each**, write **at least three** tests (a test is a use of ```checkExpect```) where each of the three has a different length of array used in the input.

- Write a method called ```reverseJoinWith``` that takes an array of ```String``` and a ```String``` separator, and returns a new String that contains the strings from the array separated by that separator, but in the reverse order. For example, for an array containing ```"a"```, ```"b"```, and ```"c"``` with separator ```":"```, the result would be ```"c:b:a"``` (note that there’s no colon at the end, just in between the elements). If the input array is empty, the method should return the empty string. If the input array contains only one string, the method should return that string.
- Write a function named ```logicalOr``` that takes an array of ```boolean``` values and returns ```false``` if all elements in the array are ```false```, else it returns ```true```. If the array is empty, the function should return ```false```.
- Write a method called ```allOutsideRange``` that takes an array of ```double``` and two other ```double```s called ```low``` and ```high```, and returns ```true``` if all of the numbers in the array are either less than ```low``` (exclusive) or greater than ```high``` (exclusive). If the array is empty, this should produce ```true```. You can assume that ```low``` ≤ ```high```.
- Write a class called ```Pair``` with two ```int``` fields, ```a``` and ```b```, and include a constructor. (Add ```Pair``` at the top level, outside the ```ArrayExamples``` class). Then write a method (in ```ArrayExamples```, not in ```Pair```) called ```addMulti``` that takes an array of ```int``` and returns a ```Pair``` where the ```a``` field is set to the sum of all integers in the array and the ```b``` is set to the multiplication of all integers in the array. Assume the array has at least one element, and integer sum/multiplication wouldn't go beyond the range of an int.
- Write a method called ```lastSortedString``` that takes an array of ```String```s and returns the ```String``` that is the last when all strings are ordered alphabetically (Computer scientists have a fancy name for alphabetical: **lexicographic**. You will need the [```compareTo``` method on Strings here](https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)). Try it out on a few examples if you're not sure what it will do!). You can assume that the array has at least one element, and the string will only consist of lowercase alphabets. For example: you are given an array: ```["bye", "hello", "goodbye"]```, your method should return ```hello```, as when all strings are sorted alphabetically, ```hello``` would be at the last.
- Write a method called ```lookup``` that takes an array of ```String``` called ```keys```, an array of ```int``` called ```values```, and a ```String``` called ```key``` (three total parameters). It should find the index in ```keys``` where the argument ```key``` appears, and then return the ```int``` stored in ```values``` at that index (Hint: you may want to use ```.equals``` or ```.compareTo``` for string comparison instead of ```==```). If the key is not found, the method should return ```-1```. You can assume that ```lookup``` will always be given two arrays of the same length, and that there are no duplicate strings in ```keys```.
Example: ```keys``` contains ```"UCSD"```, ```"UCLA"```, ```"UCI"``` and ```values``` contains ```36000```, ```44900```, and ```33467```. For ```key``` ```"UCI"```, it should return ```33467```. For key ```"Stanford"```, it should return ```-1```.

## Using Main and Command-line Arguments
- In a file called Shortest.java, write a class called Shortest. It should have a main method which prints out the shortest string in the command line arguments. If no arguments were given, it should print nothing. Example:
    ```
    $ javac Shortest.java
    $ java Shortest which argument is the Shortest
    is
    $ java Shortest five six seven eight
    six
    $ java Shortest
    $
    ```
    You can assume that there is not a tie for the shortest string’s length.
- In a file called ```Stats.java```, write a class called ```Stats```. It should have a main method which has a different effect depending on the first command line argument. In all cases, it can assume that there will be at least two command-line arguments, and all the arguments after the first are appropriate arguments to ```Double.parseDouble```. If the first argument is …
    - ```"--product"```, print the product of the provided numbers
    - ```"--mean"```, print the average (mean) of the provided numbers
    - ```"--total"```, print the sum of the provided numbers
    - ```"--max"```, print the maximum of the provided numbers
    - ```"--min"```, print the minimum of the provided numbers
    - any other string, print "Bad option \<arg\>" where you will replace "\<arg\>" with the first argument
    - *(Hint: As has been mentioned above, when comparing Strings, the ```==``` operator can be unreliable. Instead use ```.equals``` or ```.compareTo```, which are in the Java String documentation.)*

    Examples:
    ```
    $ javac Stats.java
    $ java Stats --product 2 3 4
    24.0
    $ java Stats --mean 5 9 7
    7.0
    $ java Stats --total 1 9 4
    14.0
    $ java Stats --max 9 1 4 0
    9.0
    $ java Stats --min 9 1 4 0
    0.0
    $ java Stats --mix 3 4 5
    Bad option --mix
    ```
   
## Submission

- [ ] Debug.java
- [ ] ArrayExamples.java
- [ ] Shortest.java
- [ ] Stats.java

## FAQ

1. Can we use *\<some other library\>* in this PA instead of loops?
- Try to use the things we learned most recently. That said, if you know something you want to try, that's fine. Just be warned that it might be more work to not use the stuff we just learned


2. I wrote test methods with the Tester, but `./run` is telling me that no tests ran.
- Tester methods have to start with “test” at the beginning! For example, `boolean testAdd(Tester t) { …. }`. In `ArrayExamples.java`, all tests should be in class `ArrayExamples`, not `Pair`.


3. I failed some tests on Gradescope, but it is not showing me any error message, so I don’t know what is wrong. 
- We did something slightly different with this autograder. For each method we wrote several tests but only publicly show you some of their results in detail. The goal is to give you a nudge to think more about detailed tests you could write for your own methods. So you can see where you failed and all you know (for now) is that you should try testing and understanding those methods more. 

4. My `lastSortedString` method's tests on Gradescope are not passing. 
- Double check your understanding of `compareTo` method. Try using `compareTo` with longer strings and seeing the result. Does the method always return 0, -1, or 1?


5. I am receiving an array index out of bounds error in `Shortest.java`. 
- Unlike some of the previous method, you can not make the assumption that string argument(s) will be given. Hence, args[0] will throw the index out of bounds error. What is a possible way to check if any arguments are given?


6. Help! I did the conditional checking and `Shortest.java` is still throwing index out of bounds!

- Consider the following:
`if (...){
    // inside for loop
}
// after for loop`
Recall that regardless if the if statement runs or not, the code beneath the if statement will run if not wrapped in an else statement. An else statement may be useful in avoiding the index out of bounds error.
