package com.shapes;

import java.util.Scanner;

public class Triangle extends Rectangle{ //inherits from class Shape
    private Scanner scanner;
    private int Hypotenuse;

    public int getHypotenuse() {
        return Hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        Hypotenuse = hypotenuse;
    }



    @Override
    public double calculateArea() {
        return (getLength()*getWidth())*0.5;
    }


    @Override
    public double calculatePerimeter() {
        return getWidth()+getLength()+getHypotenuse();
    }

    @Override
    public void prompt(Scanner scanner) {
        System.out.println("enter the length of the Triangle");
        setLength(scanner.nextInt());
        System.out.println("enter the width of the Triangle");
        setWidth(scanner.nextInt());
        System.out.println("enter the Hypotenuse of the Triangle");
        setHypotenuse(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type ="+"Triangle"+
                " | Length ="+getLength()+
                " | width ="+getWidth()+
                " | Hypotenuse ="+getWidth()+
                " | Area ="+calculateArea()+
                " | Perimeter ="+calculatePerimeter();
    }

}
