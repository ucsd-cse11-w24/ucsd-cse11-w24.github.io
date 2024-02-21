---
layout: with-sidebar
index: 7
name: PA7
released-on: "2024-02-21"
---

# Programming Assignment 7

## String Manipulation, Command line, and File I/O

### Due Date: Wednesday, March 6, 8:00AM Pacific Time

In this assignment you will put together many of the programming features and
techniques you've seen so far to build a useful command-line application for
text manipulation. This program is larger than the ones you've written so far for this course,
so you should **start early** so you understand the scope. Use the
milestones to get started and work incrementally.

On this assignment, we **encourage** you to share publicly and with other
students what you think the expected output should be on particular examples.
For example, you could share a `java StringSearch ...` command you tried out,
and show the results, and check with other students if they agree on the
behavior. This allows you to discuss how the assignment is supposed to work
without sharing any code, and you also might want to share examples you found
interesting!

We ask that you **not share** your code in public posts on Piazza or with other students on this PA. It's an important PA to work through the code
yourself to get the most learning out of it.

Submission checklist:

- [ ] `StringSearchMilestone1.java`
- [ ] `StringSearchMilestone2.java`
- [ ] `StringSearchMilestone3.java`
- [ ] `StringSearchMilestone4.java`
- [ ] `StringSearch.java`

Starter code can be found in [this link](https://github.com/ucsd-cse11-w24/cse11-pa7-starter).

## Task

<div class='sidenote'>The task is similar to the famous programs <a href="https://en.wikipedia.org/wiki/Grep"><code>grep</code></a> and <a href="https://en.wikipedia.org/wiki/Sed"><code>sed</code></a>.</div>

In a file called `StringSearch.java`, you'll write a class `StringSearch`
with a `main` method that uses command-line arguments as described below.

The `main` method should expect from 1 to 3 command-line arguments:

```
$ java StringSearch "<file>" "<query>" "<transform>"
```

The overall goal of `StringSearch` is to take a file of text, search for
lines in the file based on some criteria, then print out the matching lines
after transforming them somehow.

The `<thing>` syntax means, as usual, that we will be describing what kinds
of syntax can go in each position in more detail.

- `<file>` should be a path to a file. We've included two for you to test
on with examples below. It is recommended to make a few of your own files and try them
out as well.
- `<query>` describes criteria for which lines in the file to print.
- `<transform>` describes how to change each line in the file before printing.

### Queries

The `<query>` part of the command-line should be a `&`-separated sequence of
individual queries. The individual queries are:

- `length=<number>` which matches lines with exactly `<number>` characters
- `greater=<number>` which matches lines with more than `<number>` characters
- `less=<number>` which matches lines with less than `<number>` characters
- `contains=<string>` which matches lines containing the `<string>` (case-sensitive)
- `starts=<string>` which matches lines starting with the `<string>`
- `ends=<string>` which matches lines ending with the `<string>`
- `not(<some non-not query>)` which matches lines that _do not_ match the inner query

### Transforms

The `<transform>` part of the command-line should be a `&`-separated sequence
of individual transforms. The individual transforms are:

- `upper` which transforms the line to uppercase
- `lower` which transforms the line to lowercase
- `first=<number>` which transforms the line by taking the first `<number>`
characters of the line. If there are fewer than `<number>` characters,
produces the whole line
- `last=<number>` which transforms the line by taking the last `<number>`
characters of the line. If there are fewer than `<number>` characters,
produces the whole line
- `replace=<string>;<string>` which transforms the line by replacing all
appearances of the first string with the second (some lines might have no
replacements, and won't be transformed by this transform)

Where you see `<string>` above, it should always be characters inside
_single_ quotes, like `'abc'`. We chose this because it works best with
command-line tools. The `<file>`, `<query>`, and `<transform>` command-line arguments should
always be inside double quotes. This ensures that they won't be interpreted
as commands, or parts of commands, by your terminal. Where you see `<number>` above, it should always be a positive integer.

You may find the built-in Java <a href="https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/String.html#split(java.lang.String)">String `split` method</a> useful.

### Examples

<div class='sidenote'>If just one command-line argument is provided, the program
should print the file's entire contents. If two command-line arguments are provided, just the matching lines should print without any transform.</div>

The file `poem.txt` contains the following content:
```
This is a short file
It contains text and this is
Also a haiku
```

The file `words` contains a standard dictionary.

The following commands, when run at the command line, should produce the given outputs.

```
$ java StringSearch "poem.txt"
This is a short file
It contains text and this is
Also a haiku
$ java StringSearch "poem.txt" "greater=13"
This is a short file
It contains text and this is
$ java StringSearch "poem.txt" "not(contains='short')"
It contains text and this is
Also a haiku
$ java StringSearch "poem.txt" "greater=13&starts='This'"
This is a short file
$ java StringSearch "poem.txt" "contains='his'" "last=10"
short file
nd this is
$ java StringSearch "poem.txt" "contains=' a '" "upper&first=18"
THIS IS A SHORT FI
ALSO A HAIKU
$ java StringSearch "poem.txt" "greater=3&less=100&not(ends='z')" "replace='i';'I'"
ThIs Is a short fIle
It contaIns text and thIs Is
Also a haIku
$ java StringSearch "poem.txt" "greater=3&less=100&not(ends='u')" "replace='i';'I'"
ThIs Is a short fIle
It contaIns text and thIs Is
$ java StringSearch "words" "contains='no'&starts='x'&not(contains='xeno')" "lower"
xanthocyanopsia
xanthocyanopsy
xanthocyanopy
xanthomelanous
xoanon
xylenol
xyloquinone
xylorcinol
```

## Milestones

You **must** submit the following milestones with your submission. You should
save them in files called `StringSearchMilestone1.java`,
`StringSearchMilestone2.java`, and so on. This serves to help you break the
program into small chunks of progress, and also when you come to help hours you
can let us know which milestone you are working on.

We recommend working on the first milestone directly in `StringSearch.java`.
Once it's working, you can save to the `StringSearchMilestone1.java` file to
record your progress and keep working in `StringSearch.java`. You can then
work towards the second milestone, and copy your work over to the `StringSearchMilestone2.java` when done with that milestone,
and so on to build up your submission.
You can upload any of the milestones to Gradescope to get grading feedback on
them. We recommend uploading to Gradescope every time you finish each milestone, so that you can see autograder feedback before moving on to the next milestone.

### Milestone 1

Your program should take in one argument that is the name of the file to
read, and print out all the lines in that file in order.
Your code includes this code snippet at the top of your files, in order to read the contents of a file. There are one or two things
in this file-reading code that are new-ish Java features. The `getLines()` method takes a `path` to a file as a String input, and returns all of the lines in the file as an array of Strings. 
It prints an error message if it cannot find a file that matches the `path`. 

```
import java.nio.file.*;
import java.io.IOException;
class FileHelper {
    static String[] getLines(String path) {
        try {
            return Files.readAllLines(Paths.get(path)).toArray(String[]::new);
        }
        catch(IOException e) {
            System.err.println("Error reading file " + path + ": " + e);
            return new String[]{"Error reading file " + path + ": " + e};
        }
    }
}
```

Your code needs a class named `StringSearch` and `main` method within the `StringSearch` class. The `main` method has to print out all the lines in the file.

### Milestone 2

If one argument is given to command line, your program should print out all the lines in the file as it did in Milestone 1. If two arguments are given, then the first argument is the name of the file and the second argument is a _single_ contains
query. Your program should print all the lines that match that single contains query.

To achieve this goal, you need to create a class named `ContainsQuery` that has a `String` field and a method named `matches` within the class using the following format
```
boolean matches(String s)
```
The `matches` method should return whether the String `s` satisfies the `ContainsQuery`. For example, 
```
ContainsQuery query = new ContainsQuery("hello");
boolean result1 = query.matches("hello world"); // true
boolean result2 = query.matches("Hello world"); //false
```


### Milestone 3

If one argument is given to command line, your program should print out all the lines in the file as before. If two arguments are given,
your program should take in the name of the file and a _single_ query of any
type, and print all the lines that match that single query.

To achieve this goal, you need an interface `Query` that has a `boolean matches(String s)` method. 
Also, you need to implement a method `static Query readQuery(String q)` that takes a query string and
produces a `Query`, within the `StringSearch` class.


### Milestone 4

If one argument or two arguments are given to command line, your program should run in the same way as before.

If three arguments are given, your program should take them as the name of the file and a _single_ query of any
type and a _single_ transform of any type, and print all the lines that match
that single query, transformed by that single transform.

To achieve this goal, you need an interface `Transform` that has a `String transform(String s)` method.
Also, you need to make a method `static Transform readTransform(String t)` that takes a transform string
for a single transform and produces a `Transform`, within the `StringSearch` class.


### StringSearch.java

After milestone 4, complete the full task as described above.
To achieve the goal, you need to implement a method `static boolean matchesAll(Query[] qs, String s)` that returns `true` if
all the queries match a given string, within the `StringSearch` class.
Also, you need to implement a method `static String applyAll(Transform[] ts, String s)` that returns the
result of applying all of the `Transform`s in `ts` to `s` in order, within the `StringSearch` class.


## Submission and Check-off

Submit your 5 code files (4 milestones and final `StringSearch.java`) to
`pa7` on Gradescope.

There will be an automatic set of tests that run on Gradescope while the
assignment is out.

## Extensions

These are not for credit, but you may find them interesting to try on your own.

1. Add a new transform of your own design.

2. Add a new query of your own design.

3. All of the queries above are joined in the style of `AndQuery` from the
`ImageQuery` reading, where they all need to be true to match a line. Extend
your implementation to accept both `&` and `|` as separators between queries,
where `|` indicates joining queries by **or** rather than **and**. Describe
the design and details of how to read in and interpret a mix of `&` and `|`
within a query to a user.

4. Support multiple queries (including more `not` queries) within the
parentheses for `not`.

## FAQ

**Q: My queries and/or transforms worked fine locally but failed on the autograder.**

The autograder checks for sample tests provided in the writeup as well as some more interesting cases. Try to come up with more thorough test cases when testing locally!

**Q: What does "a query of any type" in Milestone3 mean?**

This means any **single** query (length, greater, less, contains, starts, ends, not) could be used to test the Milestone3 code. An example of a test that would **not** be run on Milestone3 but could be run on the final completed task is:

    ```
    $ java StringSearch "poem.txt" "greater=13&starts='This'"
    This is a short file
    ```

**Q: What if there are multiple transforms?**

The transforms should be applied in order, from left to right.

**Q: Can multiple queries be included within a `not` query like `not(greater=3&less=100)`?**

No, only a single query is included within the parentheses for `not`.

**Q: Can there be a transform without there being a query?**

No, if there's a transform there will also be a query

**Q: If a replace-able string overlaps, for example replacing `aaa` with `b` in `aaaa`, which should happen?**

Replace the earliest occurrence in the part that overlaps. So this would produce
`ba`. Check what the `replace` method on strings does, as well, to see if that
does what you need before making it more complicated for yourself!


