package com.company.Prototype;

public class Square extends ShapePrototype {

    public Square(){
        type = "Квадрат";
    }

    @Override
    public void draw() {
        System.out.println("В квадрате.");
    }
}