package com.company.Factory;

import com.company.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("В прямоугольнике.");
    }
}
