package com.lsdi.desingnpattern.creational.singleton;

/*
Quando usar o padrão de design singleton
        *Para recursos que são caros de criar (como objetos de conexão de banco de dados)
        *classes que fornecem acesso às definições de configuração do aplicativo
        *Classes que contêm recursos que são acessados em modo compartilhado
*/

//Melhor opção
public class Singleton  {
    private Singleton() {}

    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

}
