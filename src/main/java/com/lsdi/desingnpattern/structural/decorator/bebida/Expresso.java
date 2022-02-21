package com.lsdi.desingnpattern.structural.decorator.bebida;

public class Expresso extends Bebida{

    public Expresso(){
        descricao = "Café Expresso";
    }

    @Override
    public double getPreco() {
        return 1.50;
    }
}
