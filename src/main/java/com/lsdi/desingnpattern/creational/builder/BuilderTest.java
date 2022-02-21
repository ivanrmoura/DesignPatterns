package com.lsdi.desingnpattern.creational.builder;

/*
-Quando o processo envolvido na criação de um objeto é extremamente complexo,
com muitos parâmetros obrigatórios e opcionais
-Quando um aumento no número de parâmetros do construtor leva a uma grande lista de construtores
-Quando o cliente espera representações diferentes para o objeto que é construído
 */

public class BuilderTest {

    public static void main(String[] args) {

        BankAccount ivanAccount = new BankAccount
                .BankAccountBuilder("Ivan", "305147899")
                .withEmail("ivan.rodrigues@gmail.com")
                .wantNewsletter(true)
                .build();

        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .withEmail("jon@example.com")
                .wantNewsletter(true)
                .build();
    }
}
