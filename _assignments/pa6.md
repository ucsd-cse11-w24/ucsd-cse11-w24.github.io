---
layout: with-sidebar
index: 6
name: PA6
released-on: "2023-02-14"
---

# Programming Assignment 6

### Due Date: Wednesday, February 21, 10:00AM Pacific Time

## Learning Goals 
- This PA will give you an opportunity to reflect on how you work through
programs.

## Collaboration
Different assignments in this course have different collaboration policies.
On this assignment, you **cannnot** collaborate with anyone. Your submission
must be your own work and you cannot share or post code from your submission
anywhere other than to hand in the assignment.

The starter code is available at:

[https://github.com/ucsd-cse11-w24/cse11-pa6-starter](https://github.com/ucsd-cse11-w24/cse11-pa6-starter)

## Submission checklist
  - `[ ]` PDF to Gradescope assignment `pa6-notes`
  - `[ ]` Two code files for completed tasks to `pa6-code` (just two of four programs need to be completed)

## Task

Make a copy of [this Doc](https://github.com/ucsd-cse11-w23/cse11-pa6-starter/blob/main/PA6%20Template.docx).
Here is also the [pdf version](https://github.com/ucsd-cse11-w23/cse11-pa6-starter/blob/main/PA6%20Template.pdf) if you need it. 
You will fill it in as you work.

Your task is to complete **two** of the following programs of your choice,
and also complete a reflection while you are working.

When you're ready to start programming, set a timer for 30 minutes – work on
these tasks for that much time. Then, take a screenshot or copy/paste (a)
your code and (b) the output of the most recent time you ran the program.
It's totally fine if running your code is producing errors at this point, the
idea is just to take notes on progress.

Put that output into the Google Doc at the 30 minute mark, and write down a
few sentences about your thought process at this point. Also note if you got
distracted by another browser tab, your phone, etc during that 30 minutes.
You don't have to tell us how, just say yes/no and how many minutes you think
you were distracted for.

When you work again, set another 30 minute timer and work for that time, then
repeat taking notes. Then do this one more time, for a total of three 30 minute
sessions each followed by note-taking.

If you don't finish the task, still stop after the three sessions and put the
notes for the reflection in place (it's not expected that you must finish in
90 minutes, though you do have to finish, see below). If you finish early,
note the time you finished.

The tasks, which you should complete two of, are here:

- In a file called `PositiveMinMaxAvg.java`, write a class with a `main`
method that expects all the command-line arguments to be appropriate inputs
to `Double.parseDouble`. It should print the average of the maximum and the minimum **positive** arguments from the
command-line arguments that, when parsed as doubles, are strictly greater
than 0. If there are less than 2 numbers in the array that are greater than 0, it
should produce 0. For example, let's say your arguments are `-1.5, 2.5, 3.5, 5`,
then your answer will be `(2.5 + 5)/2 = 3.75` (`2.5` is the minimum positive, and 5 is the maximum positive).

  Try out at least _six_ different uses of `PositiveMinMaxAvg` at the command
  line with different lists of numbers that convince you it works for all of
  the important cases.

  Note: You can assume that the value you will get for autograder test cases are in the range -10 to 10. 

- In a file called `TripletSelect.java`, add a class `Triplet` with fields `a`,
`b`, and `c` of type `int` (add a constructor to initalize those fields). In a class
called `TripletSelect`, write a method `getBs` that takes an array of `Triplet` and
returns an array of `int` that contains the `b` field of all the `Triplet`s in
the array given as an argument. Write at least 4 `checkExpect` tests for it
to cover interesting cases.

  Note: Do not make your `getBs` method as `public` or `static`. It won't pass on the autograder if you do this way. 

- In a file called `ShortStrings.java`, write a method called `shortStrings`
that takes an array of `String` and an integer `n` and produces a new array
of `String`s that are just the strings in the array that have length `n` or
lesser (the returned array might be **shorter** than the input array). Write
at least 4 `checkExpect` tests for it to cover interesting cases.

  Note: Do not make your `shortStrings` method as `public` or `static`. It won't pass on the autograder if you do this way. 

- Copy the `Point` class from the [regions
code](https://github.com/ucsd-cse11-w23/cse11-pa6-starter/blob/main/ExamplesRegion.java) in lecture into
a new file called `ClosestPoints.java`. Write a class called `ClosestPoints`
with a `main` method that expects to get six command line arguments,
representing the x and y coordinates of three points. For example:

    ```
    $ java ClosestPoints 0 0 3 4 3 900
    ```

    Would represent the points (0, 0), (3, 4), and (3, 900). Your program
    should print out the pair of points that are closest to one another out
    of the three points, using the format below:

    ```
    $ java ClosestPoints 0 0 3 4 3 900
    The closest points are (0, 0) and (3, 4) at distance 5.0
    ```

Note: You don't need to write test cases for the programs that use the main method (`ClosestPoints`, and `PositiveMinMaxAvg`), although you are encouraged to run the programs yourselves to ensure correctness. Autograder will run your program on some test cases, and give you your score. 

## Reflection

After you're done with all three sessions (not necessarily the whole
assignment), reflect on the following:

- Where did you spend the most time? You might have different descriptions,
some I can think of that I spend a lot of time on are below; you might have
others.
  - Thinking about a particular part of the program
  - Understanding an error message
  - Figuring out why a particular test wasn't working
  - Typing
- What could you do to reduce the time taken in the future?
- How did this process compare to how you usually complete PAs?
- Overall, what did you learn from this experience about your programming
workflow, if anything?

Some comments on this process: this may not be the ideal way for you to work.
Sometimes I get a lot of “programming” done while walking my dog, and
sometimes setting a problem down for a while and coming back to it is the
best thing. You might be working on a day where other urgent obligations
interrupt you every 5 minutes. Sometimes you may need to focus really hard
for several hours to make any progress. So I don't expect that you can or
should always follow this process. However, doing it once might give you a
useful scaffolding strategy, and it does help you understand how your time
management and focus works while you're programming, where you got stuck,
etc. So for that reason I think this is a really useful exercise.

## Finishing

You must still finish these programs as part of the assignment. The autograder score is not your final score (But you should still get full score if your code is correct), and we will grade the submissions
manually after the deadline. Come ask for help in tutor hours (help sessions) 
if you need help finishing them! We do ask that you spend at least one 
30-minute session with notes before coming to help sessions on PA6, and we 
might ask to see your notes for a sense of your progress when you come.

## Submission

You need to turn in a pdf of the Notes document. Either convert the .docx file into pdf (using Google Docs or Word), or fill in your answers in the pdf version provided.
You'll hand it in under the `pa6-notes` assignment on Gradescope.

You'll hand in the two `.java` files with your completed tasks to the
`pa6-code` assignment on Gradescope.

## Challenges and Extra Practice

If you want more practice or an extra challenge, try writing the programs
below. These are not for credit, but feel free to ask us about them on
Piazza if you found them interesting!

- Make `ClosestPoints` work for any number of points input on the command
line.
- Write a method `zip` that takes two arrays of `int` that have the same
length and produces an array of `Pair` where the `Pair`'s `a` and `b` fields
are the values in the corresponding index in the first and second provided
`int` array.
- Write a method `unzip` that takes an array of `Pair` and returns two
arrays, one containing the `a` elements and one containing the `b` elements.
Decide how to represent the return value yourself.

## FAQ
1. You only need to finish/submit 2 of the 4 tasks, and pa6-code assignment on Gradescope is due on the same day as pa6-notes (February 21st).

