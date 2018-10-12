package com.itminds;

import java.util.ArrayList;

abstract class Bar {
    protected Foo foo;

    protected Bar(Foo foo) {
        this.foo = foo;
    }

    public abstract void update();
}

abstract class Foo {
    private ArrayList<Bar> _list = new ArrayList<Bar>();

    public void attach(Bar bar) {
        _list.add(bar);
    }

    public void detach(Bar bar) {
        _list.remove(bar);
    }

    public void Notify() {
        for (Bar o : _list) {
            o.update();
        }
    }
}

/* Write your answers and comments below this line
 I think this is the Observer Design Pattern. It provides a method to register and unregister to
 a class. The class objects that have register with a class object will get updated
 when the class object receives a notfication. This allows to send data to multiple classes. The
 cons is when a simple update can cause a long chain of other updates.

 */
