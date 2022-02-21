package com.lsdi.desingnpattern.structural.adapter;

/*
Quando um componente externo fornece uma funcionalidade cativante que gostaríamos de reutilizar,
mas é incompatível com nosso aplicativo atual . Um adaptador adequado pode ser desenvolvido para torná-los compatíveis entre si
Quando nosso aplicativo não é compatível com a interface que nosso cliente espera
Quando queremos reutilizar o código legado em nosso aplicativo sem fazer nenhuma modificação no código original
 */

public class AdapterTest {

    public static void main(String[] args) {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println(bugattiVeyronAdapter.getSpeed());

    }
}
