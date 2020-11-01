package com.company.Prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, ShapePrototype> shapeMap  = new Hashtable<String, ShapePrototype>();

    public static ShapePrototype getShape(String shapeId) {
        ShapePrototype cachedShape = shapeMap.get(shapeId);
        return (ShapePrototype) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}