package com.itminds;

import java.util.HashMap;

/**
 * A list with all possible transport method
 */
public class TransportationMethod {
    private final HashMap<String, Double> allTransportation = new HashMap<String, Double>();

    /**
     * An easy method to add more transportaion method if needed
     * @return a hashmap of possible transport method
     */
    public HashMap<String, Double> map() {
        //Add more transportation method here
        allTransportation.put("PLANE", 2.0);
        allTransportation.put("CAR", 1.0);
        return allTransportation;
    }
}
