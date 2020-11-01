package com.company.Abstract;

import com.company.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("В круглом прямоугольнике.");
    }
}