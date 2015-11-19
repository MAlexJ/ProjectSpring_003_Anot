package com.malex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rectangle extends Figure {
    private int weidth;
    private int heigth;

    @Autowired
    public Rectangle(@Value("rectangle") String name, @Value("2") int weidth, @Value("5") int heigth) {
        super(name);
        this.weidth = weidth;
        this.heigth = heigth;
    }

    @Override
    public double perimeter() {
        return 2 * (weidth + heigth);
    }
}
