package com.lsdi.desingnpattern.comportamental.state;

public class StateDemo {

    public static void main(String[] args) {
        Package pkg = new Package(new OrderedState());
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
    }
}
