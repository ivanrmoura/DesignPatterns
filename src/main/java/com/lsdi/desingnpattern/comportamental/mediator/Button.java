package com.lsdi.desingnpattern.comportamental.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Button {
    private Mediator mediator;

    public void press() {
        mediator.press();
    }
}
