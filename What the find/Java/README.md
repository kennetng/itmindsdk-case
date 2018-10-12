# What the Find

You are looking through an object graph for an object that satisfies a given predicate.

![Object graph](./images/object_graph.png)

You don't know these objects. So a function (`getChildren`) that will return the next potential object(s) in the graph chain is provided.

You're supposed to implement the following static method.

C#
```csharp
public static T FindWhere<T>(this T root, Func<T, bool> predicate, Func<T, IEnumerable<T>> getChildren)
```
Java
```java
public static <T> T findWhere(T root, Predicate<T> predicate, Function<T, Iterable<T>> getChildren)
```

One possible usage of the function could be as follows, but not limited to:

C#
```csharp
public class Node
{
    public int Value { get; set; }
    public IEnumerable<Node> Children { get; set; }
}

var nodeB = new Node { Value = 1 };
var nodeA = new Node { Value = 0, Children = new List<Node> { nodeB } };

node.FindWhere(x => x.Value == 1, x => x.Children); // returns nodeB
```
Java
```java

Node root = new Node(0);
Node child = new Node(1);
root.getChildren().add(child);

Extensions.findWhere(root, x -> x.getValue() == 1, x -> x.getChildren()); // returns child

class Node {
    private int value;
    private ArrayList<Node> children;

    public Node(int value) {
        this.value = value;
        children = new ArrayList<Node>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }
}
```

# Solution

Implement your solution in the `Extensions` file.
If you see `// YOUR SOLUTION GOES HERE` you've found the right place :-)

## What you'll be evaluated on

You'll be evaluated on your ability to solve this solution but also on how you solve it.
