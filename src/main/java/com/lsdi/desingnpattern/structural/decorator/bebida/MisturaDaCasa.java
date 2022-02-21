package com.lsdi.desingnpattern.structural.decorator.bebida;

public class MisturaDaCasa extends Bebida{

    public MisturaDaCasa(){
        descricao = "Café Mistura da Casa";
    }

    @Override
    public double getPreco() {
        return 2.80;
    }

}
