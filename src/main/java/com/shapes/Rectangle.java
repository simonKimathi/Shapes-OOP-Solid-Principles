package com.shapes;

import java.util.Scanner;

public class Rectangle extends Shape implements Shape2DI{ //inherits from class Shape
    private Scanner scanner;

    public Rectangle() {
        scanner=new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double calculateArea() {
        return(getLength()*getWidth());
    }


    @Override
    public double calculatePerimeter() {
        return (2*(getLength()+getWidth()));
    }

    @Override
    public void prompt(Scanner scanner) {
        System.out.println("enter the length of the rectangle");
        setLength(scanner.nextInt());
        System.out.println("enter the width of the rectangle");
        setWidth(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type ="+"Rectangle"+
                " | Length ="+getLength()+
                " | width ="+getWidth()+
                " | Area ="+calculateArea()+
                " | Perimeter ="+calculatePerimeter();
    }
}
