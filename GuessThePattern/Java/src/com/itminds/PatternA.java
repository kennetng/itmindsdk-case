package com.itminds;

public class PatternA {
    private static PatternA instance;

    private PatternA() {
    }

    public static PatternA getInstance() {
        if (instance == null)
            instance = new PatternA();

        return instance;
    }

    public void doWork() {
        throw new UnsupportedOperationException();
    }
}

/* Write your answers and comments below this line
This is the Lazy Initialization method to implement Singleton pattern. It
works fine for single thread and useful when one object is needed to do an action across the system,
but when there is multiple threads creating instances of PatternA at the same time.
It will destroy singleton pattern, because threads access different instance from each other.
 */