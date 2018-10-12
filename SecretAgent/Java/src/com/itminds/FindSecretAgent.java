package com.itminds;

import java.util.HashSet;
import java.util.Set;

/**
 * Finds the secret agent by using HashSet as a counter
 */
public class FindSecretAgent implements IFindSecretAgent {
    /**
     * Search for duplicates number
     *
     * @param ids Iterable<Integer>
     * @return integer that is a duplicate
     */
    @Override
    public int startSearch(final Iterable<Integer> ids) {
        final Set counter = new HashSet();
        for (final Integer i : ids) {
            if (!counter.add(i)) {
                return i;
            }
        }
        return -1;
    }
}
