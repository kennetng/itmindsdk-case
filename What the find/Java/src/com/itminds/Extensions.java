package com.itminds;

import java.util.function.Predicate;
import java.util.function.Function;

/**
 *  Finds a node that satisfy the predicate and returns it
 */
public class Extensions {
    /**
     * The method finds the child node of root that satisfies the predicate
     *
     * @param root root node
     * @param predicate predicate to test against
     * @param getChildren
     * @param <T>
     * @return node that satisfies predicate
     */
    public static <T> T findWhere(final T root, final Predicate<T> predicate, final Function<T, Iterable<T>> getChildren) {
        // YOUR SOLUTION GOES HERE
        //Return the root if it that satisfy the predicate
        if (predicate.test(root)) {
            return root;
        }

        final Iterable<T> listOfChildren = getChildren.apply(root);

        //If root does not satisfy the predicate, check its children
        for (final T t : listOfChildren) {
            return findWhere(t, predicate, getChildren);
        }

        return null;
    }
}