package com.company.Factory;

import com.company.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("В квадрате.");
    }
}