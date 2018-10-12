package com.itminds;


import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Integer foo[] = { 1, 4, 2, 4, 3, 6};
        Iterable<Integer> iterable = Arrays.asList(foo);
        FindSecretAgent fsa = new FindSecretAgent();
        System.out.println("Capture both SOLDIER ID: " +fsa.startSearch(iterable));
    }
}
