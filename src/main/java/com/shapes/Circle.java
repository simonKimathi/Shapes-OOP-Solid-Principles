package com.shapes;

import java.util.Scanner;

public class Circle  extends Shape implements Shape2DI { //inherits from class Shape
    private Scanner scanner;

    public Circle() {
        scanner = new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double calculateArea() {
        return 3.14*(Math.pow(getLength(),2));
    }


    @Override
    public double calculatePerimeter() {
        return 3.14*(getLength()*2);
    }

    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Radius  of the circle");
        setLength(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type =" + "Circle" +
                " | Radius =" + getLength() +
                " | Area =" + calculateArea() +
                " | Perimeter =" + calculatePerimeter();
    }
}
