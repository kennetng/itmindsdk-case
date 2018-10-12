package com.itminds;

import java.util.ArrayList;
import java.util.Date;

public class Program {
    public static void main(String[] args)
    {
        System.out.println("Filling array: ");
        Iterable<String> strs = fill(40000);
        {
            System.out.println("Executing inefficient String-Helper method: ");
            Date before = new Date();
            String output = StringHelpers.mergeStrings(strs);
            Date after = new Date();
            System.out.println("Length: " + output.length());
            System.out.println("Elapshed time: " + (after.getTime() - before.getTime()));
        }
    }

    private static Iterable<String> fill(int n)
    {
        ArrayList<String> strs = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            strs.add(i + "");
        }
        return strs;
    }
}
