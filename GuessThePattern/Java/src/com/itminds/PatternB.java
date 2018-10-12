package com.itminds;

abstract class SomeObject {

}

class ConcreteSomeObject extends SomeObject {
}

abstract class PatternB {
    public abstract SomeObject Create();
}

class ConcretePatternB extends PatternB {

    @Override
    public SomeObject Create() {
        return new ConcreteSomeObject();
    }
}

/* Write your answers and comments below this line
This is the Factory Design Pattern. This is to create a number of subclasses where subclasses can alter
the type of object that will be created. One problem can be if there is one underlying detail of one factory,
the abstract class might need to be modified for all subclasses for it.
 */