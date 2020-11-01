package com.company.Prototype;

public class Rectangle extends ShapePrototype {

    public Rectangle(){
        type = "Прямоугольник";
    }

    @Override
    public void draw() {
        System.out.println("В прямоугольнике.");
    }
}