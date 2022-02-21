package com.lsdi.desingnpattern.creational.factorymethod;

/*
Quando usar

Quando se espera que a implementação de uma interface ou classe abstrata mude com frequência
Quando a implementação atual não pode acomodar confortavelmente novas mudanças
Quando o processo de inicialização é relativamente simples e o construtor requer apenas alguns parâmetros
 */

public class FactoryTest {

    public static void main(String[] args) {
        Polygon triangle = new Triangle();
        Polygon square = new Square();
        System.out.println(triangle.getType());
        System.out.println(square.getType());
    }
}
