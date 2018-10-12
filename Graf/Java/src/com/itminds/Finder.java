package com.itminds;

/**
 * Finding a person that is n from right.
 */
public class Finder implements IFinder {
    /**
     *
     * @param customers
     * @param numberFromRight
     * @return the person that is n from right
     */
    @Override
    public String fromRight(Customers customers, final int numberFromRight) {
        int spaceBetween = 1; //Space between the back tracker and current customer
        Customers backtracker = customers; //The person that is n from the current customer

        //Loop through all person
        while (customers.getNext() != null) {
            customers = customers.getNext();
            spaceBetween++;

            //If test to make sure that backtracker is n behind current customer
            if (spaceBetween > numberFromRight) {
                backtracker = backtracker.getNext();
            }
        }
        return backtracker.getPerson();

        //throw new UnsupportedOperationException();
    }
}
/*
This code can fail if the varible "numberFromRight" is higher than the size of the node. In this case, 5 or higher.
 */