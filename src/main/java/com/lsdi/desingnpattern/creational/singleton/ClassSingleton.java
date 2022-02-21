package com.lsdi.desingnpattern.creational.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public final class ClassSingleton {

    private static volatile ClassSingleton INSTANCE;
    private String info = "Initial info class";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ClassSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ClassSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
