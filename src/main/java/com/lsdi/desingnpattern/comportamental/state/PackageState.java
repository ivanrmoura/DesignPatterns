package com.lsdi.desingnpattern.comportamental.state;

public interface PackageState {

    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();

}
