# Performance issue

During profiling of a system that does not perform well it is discovered that the bottleneck is this function:

```csharp
public static class StringHelpers
{
	public static string MergeStrings(IEnumerable<string> strs)
}
```

It's executing very slowly.

# Solution

Your task is to refactor the `StringHelpers.MergeStrings` function and explain why its execution time is improved.

You're not allowed to change the prototype of the function.

## What you'll be evaluated on

You'll be evaluated on the efficiency of your solution and the ability to explain why your code is more efficient.
