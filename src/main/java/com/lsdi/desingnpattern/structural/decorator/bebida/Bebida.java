package com.lsdi.desingnpattern.structural.decorator.bebida;

public abstract class Bebida {

    protected String descricao;

    protected Bebida(){
        descricao = "";
    }

    public String getDescricao(){
        return descricao;
    }

    abstract public double getPreco();
}

