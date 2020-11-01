package com.company.Factory;

import com.company.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("В круге.");
    }
}