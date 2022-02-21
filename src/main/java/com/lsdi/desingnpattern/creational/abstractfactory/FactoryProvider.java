package com.lsdi.desingnpattern.creational.abstractfactory;

/*
O cliente é independente de como criamos e compomos os objetos no sistema
O sistema consiste em várias famílias de objetos, e essas famílias são projetadas para serem usadas em conjunto
Precisamos de um valor de tempo de execução para construir uma dependência particular
Embora o padrão seja ótimo ao criar objetos predefinidos, adicionar novos pode ser um desafio .
Para suportar o novo tipo de objeto, será necessário alterar a classe AbstractFactory e todas as suas subclasses.
 */

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;
    }

}
