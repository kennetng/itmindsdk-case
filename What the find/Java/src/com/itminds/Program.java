package com.itminds;

public class Program {
    public static void main(String[] args) {
        Node root = new Node(0);
        Node node = new Node(0);
        Node n = new Node(2);
        node.getChildren().add(n);

        root.getChildren().add(node);

        Extensions ex = new Extensions();
        Node nn = ex.findWhere(root, x -> x.getValue() == 2, x -> x.getChildren());
        System.out.println(nn.toString()
        );
    }
}

