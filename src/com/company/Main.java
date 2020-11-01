package com.company;

import com.company.Abstract.AbstractFactory;
import com.company.Abstract.AbstractProducer;
import com.company.Builder.Meal;
import com.company.Builder.MealBuilder;
import com.company.Factory.ShapeFactory;
import com.company.Prototype.ShapeCache;
import com.company.Prototype.ShapePrototype;
import com.company.Singleton.SingleObject;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        System.out.println("(Фабричный)");
        getFactory();
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.println("-------------------------------------------------------");
        System.out.println("(Абстрактная фабрика)");
        getAbstract();
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.println("-------------------------------------------------------");
        System.out.println("(Одиночка)");
        getSingleton();
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.println("-------------------------------------------------------");
        System.out.println("(Строитель)");
        getBuilder();
        System.out.println();
        System.out.println("-------------------------------------------------------");

        System.out.println("-------------------------------------------------------");
        System.out.println("(Прототип)");
        getPrototype();
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }

    public static void getFactory() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape3.draw();
    }

    public static void getAbstract() {
        //get shape factory
        AbstractFactory shapeFactory = AbstractProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape1.draw();
        //get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        shape2.draw();
        //get shape factory
        AbstractFactory shapeFactory1 = AbstractProducer.getFactory(true);
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape3.draw();
        //get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of Shape Square
        shape4.draw();
    }

    public static void getSingleton() {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }

    public static void getBuilder() {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Вегетарианская еда");
        vegMeal.showItems();
        System.out.println("Общая сумма: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nНе вегетарианская еда");
        nonVegMeal.showItems();
        System.out.println("Общая сумма: " + nonVegMeal.getCost());
    }

    public static void getPrototype() {
        ShapeCache.loadCache();

        ShapePrototype clonedShape = (ShapePrototype) ShapeCache.getShape("1");
        System.out.println("Форма : " + clonedShape.getType());

        ShapePrototype clonedShape2 = (ShapePrototype) ShapeCache.getShape("2");
        System.out.println("Форма : " + clonedShape2.getType());

        ShapePrototype clonedShape3 = (ShapePrototype) ShapeCache.getShape("3");
        System.out.println("Форма : " + clonedShape3.getType());
    }
}
