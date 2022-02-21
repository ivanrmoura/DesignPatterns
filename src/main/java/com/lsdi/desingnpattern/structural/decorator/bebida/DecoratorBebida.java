package com.lsdi.desingnpattern.structural.decorator.bebida;

public abstract class DecoratorBebida extends Bebida {

    protected Bebida bebida;

    protected DecoratorBebida( Bebida bebida ){
        this.bebida = bebida;
    }

    abstract public String getDescricao();
}
