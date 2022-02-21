package com.lsdi.desingnpattern.creational.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String colorType) {
        if ("Brown".equalsIgnoreCase(colorType)) {
            return new Black();
        } else if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        }

        return null;
    }

}
