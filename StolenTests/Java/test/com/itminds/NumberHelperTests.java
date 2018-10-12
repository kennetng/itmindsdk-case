package com.itminds;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A test to test the method findClosestNumber(int needle, Iterable<Integer> haystack, int n) in
 * NumberHelperTests class. This test class will check for correct result and correct use of exception.
 */
public class NumberHelperTests  {
    final private List<Integer> haystack = Arrays.asList(2,5,10,12);
    final NumberHelper helper = new NumberHelper();

    /**
     * Check for the lowest int variable.
     */
    @Test
    public void testResultLow() {
        final int needle = 1;
        final ArrayList results = makeCollection(helper.findClosestNumbers(needle, haystack, 1));
        // Assert
        Assert.assertEquals(2, results.get(0));
    }

    /**
     * Check for the highest int variable.
     */
    @Test
    public void testResultHigh() {
        final int needle = 14;
        final ArrayList results = makeCollection(helper.findClosestNumbers(needle, haystack, 1));
        // Assert
        Assert.assertEquals(12, results.get(0));
    }

    /**
     * Check for multiple result.
     */
    @Test
    public void testResultMultipleN(){
        final int needle = 3;
        final ArrayList results = makeCollection(helper.findClosestNumbers(needle, haystack, 2));
        final ArrayList expectedResults = makeCollection(Arrays.asList(5,2));
        //Assert
        Assert.assertEquals(expectedResults, results);
    }

    /**
     * Check for numbers that are equally close to the needle
     */
    @Test
    public void testResultEquallyClose(){
        final int needle = 11;
        final ArrayList results = makeCollection(helper.findClosestNumbers(needle, haystack, 1));
        //Assert
        Assert.assertEquals(10, results.get(0));
    }

    /**
     * Check for Exception when using invalid Needle
     */
    @Test(expected = Exception.class)
    public void testResultInvalidNeedle(){
        final int needle = -5;
        final ArrayList results = makeCollection(helper.findClosestNumbers(needle, haystack, 1));
    }

    /**
     * Check for Exception when using invalid N
     */
    @Test(expected = Exception.class)
    public void testResultInvalidN(){
        final int needle = 4;
        final ArrayList results = makeCollection(helper.findClosestNumbers(needle, haystack, haystack.size()+5));
    }

    /**
     * Check for Exception when using an empty list
     */
    @Test(expected = Exception.class)
    public void testResultInvalidHaystack(){
        final int needle = 4;
        final ArrayList results = makeCollection(helper.findClosestNumbers(needle, Collections.emptyList(), 1));
    }
    /*
     * HELPER METHODS
    */
    private <E> ArrayList<E> makeCollection(Iterable<E> iter) {
        ArrayList<E> list = new ArrayList<E>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }

}