package com.shapes;

import java.util.Scanner;

public class Ellipse extends Circle { //inherits from class Circle

    private Scanner scanner;


    @Override
    public double calculateArea() {
        //  π × a × b
        return 3.14*getLength()*getWidth();
    }


    @Override
    public double calculatePerimeter() {
        //(4/3) × π × r3
        return 2*3.14*(Math.sqrt((Math.pow(getLength(),2)+Math.pow(getWidth(),2))/2));
    }

    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Minor axis  of the Ellipse");
        setLength(scanner.nextInt());
        System.out.println("enter the Major axis  of the Ellipse");
        setWidth(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type =" + "Ellipse" +
                " | Minor axis =" + getLength() +
                " | Major axis =" + getWidth() +
                " | Surface Area =" + calculateArea() +
                " | Volume =" + calculatePerimeter();
    }
}
