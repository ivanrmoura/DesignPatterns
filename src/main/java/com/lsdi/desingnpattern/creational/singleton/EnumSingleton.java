package com.lsdi.desingnpattern.creational.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum EnumSingleton {

    INSTANCE("Initial class info");

    private String info;

    private EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    // getters and setters
}
