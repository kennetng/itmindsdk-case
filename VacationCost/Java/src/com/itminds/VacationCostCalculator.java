package com.itminds;

import java.util.HashMap;

/**
 * Calculates the cost of vacation by using distance and transport method.
 */
public class VacationCostCalculator {
    private double distanceToDestination;
    private final TransportationMethod transportationMethod = new TransportationMethod();
    private final HashMap<String, Double> listofTransportation = transportationMethod.map();

    public VacationCostCalculator(final double disstanceToDestination) {
        this.distanceToDestination = disstanceToDestination;
    }

    /**
     * @param transportMethod string
     * @return result of the vacation cost
     */
    public double costOfVacation(final String transportMethod) {
        if (listofTransportation.containsKey(transportMethod)) {
            final double transportationCost = listofTransportation.get(transportMethod);
            return distanceToDestination * transportationCost;
        } else {
            throw new UnsupportedOperationException("Error: Transport Method " + transportMethod + " is not supported");
        }
    }

    /**
     * @return the distance of the destination
     */
    public double getDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * Set new distance of the destination
     *
     * @param distanceToDestination double
     */
    public void setDistanceToDestination(final double distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }

}

