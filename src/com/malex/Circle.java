package com.malex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle extends Figure {
    private int radius;
    public final static double PI = 3.1415;

    @Autowired
    public Circle(@Value("circle") String name, @Value("3") int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return PI * radius * radius;

    }
}
