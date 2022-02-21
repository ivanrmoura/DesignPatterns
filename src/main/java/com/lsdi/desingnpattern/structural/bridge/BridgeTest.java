package com.lsdi.desingnpattern.structural.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        Shape square = new Square(new Blue());
        System.out.println(square.draw());

        Shape triangle = new Triangle(new Red());
        System.out.println(triangle.draw());
    }
}
