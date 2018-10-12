package com.itminds;

public class Customers {
    private String person;
    private Customers next;
    public Customers(Customers next, String person) {
        this.next = next;
        this.person = person;
    }

    public Customers getNext() {
        return next;
    }

    public String getPerson() {
        return person;
    }

    public Customers previous(String person) {
        return new Customers(this, person);
    }

    public static Customers Create(String person) {
        return new Customers(null, person);
    }
}
