package com.lsdi.desingnpattern.creational.abstractfactory;

public interface AbstractFactory<T> {

    T create(String animalType) ;

}
