package com.company.Prototype;

public class Circle extends ShapePrototype {

    public Circle(){
        type = "Круг";
    }

    @Override
    public void draw() {
        System.out.println("В круге.");
    }
}