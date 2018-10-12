# The Stolen Tests

![Sneaky man with swag](../images/theif.png)

Oh no! Someone entered our laboratory last night and stole all of our unit tests for our new top secret project!

Unfortunately, we cannot ship this project, unless we have every possible edge case covered!

To make matters worse, the project is so secret that nobody knows the actual implementation of the project.

This means the only information to write the tests is the following interface, along with the original specification of the projects behavior.

C#
```csharp
IEnumerable<int> FindClosetsNumbers(int needle, IEnumerable<int> haystack, int n)
```

Java
```java
Iterable<Integer> findClosestNumbers(int needle, Iterable<Integer> haystack, int n)
```

## Top Secret Project Spec

The function finds the 'n' closets numbers to 'needle' in 'haystack'.

This means

```pseudo
FindClosestNumbers(1,{1,2,3},1) returns 1
FindClosestNumbers(6,{4,5},1) returns 5
FindClosestNumbers(11,{2,3,10},2) returns {10,3}
```

When the needle is equally close to two numbers, the lowest number should be returned, meaning
```pseudo
FindClosestNumbers(4,{3,5},1) returns 3
```

# Solution

Write your tests in the `NumberHelperTests` file.
We left a `TestExample` method for you to get started.
However you're expected to delete or re-write it.

## What you'll be evaluated on

You'll be evaluated on your ability to write tests that cover as many scenarios (line and path coverages) as possible and uphold best practices.

Extra points are given, if you write tests that make it easy to understand what scenario is covered.
