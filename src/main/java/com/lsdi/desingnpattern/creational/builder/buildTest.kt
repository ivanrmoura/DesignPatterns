package com.lsdi.desingnpattern.creational.builder

class buildTest {

    fun main(args: Array<String>){
        val foodOrder = FoodOrder.Builder()
                .bread("white bread")
                .meat("bacon")
                .condiments("olive oil")
                .build()

        println("teste")
    }

}
