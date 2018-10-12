package com.itminds;

public class Program {
    public static void main(String[] args) {
        Customers curr = Customers
                .Create("Kim")
                .previous("Hans")
                .previous("Ole")
                .previous("Peter");
        while (curr != null) {
            System.out.println(curr.getPerson());
            curr = curr.getNext();
        }
    }
}
