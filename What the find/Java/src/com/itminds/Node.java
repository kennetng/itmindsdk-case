package com.itminds;
import java.util.ArrayList;

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

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", children=" + children +
                '}';
    }
}