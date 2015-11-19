package com.malex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Print {

    @Autowired
    @Qualifier("circle")
    private Figure figure;

    public Print() {
        System.out.println("Bean print is being created");
    }

    public void showPerimeter() {
        System.out.println("Perimeter " + figure.getName() + " = " + figure.perimeter());
    }
}
