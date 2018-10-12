package com.itminds;

public class StringHelpers {
    /**
     * Append multiple string together
     *
     * @param strs Iterable<String>
     * @return a concatenate string
     */
    public static String mergeStrings(final Iterable<String> strs) {
        final StringBuilder toReturn = new StringBuilder();
        for (String str : strs) {
            toReturn.append(str);
        }
        return toReturn.toString();
    }
}
/*
    REASON: string += string creates a lot of overhead. So whenever it
            loops it creates a new string variable so the garbage collector takes
            a lot of time to remove it and too many objects in heap can slow down
            the process. StringBuilder use the same variable to concatenate strings which
            is much faster.
 */