package com.shapes;

import java.util.Scanner;

public class Square extends Rectangle { //inherits from class Rectangle
    private Scanner scanner;



    @Override
    public double calculateArea() {
        return (getLength() * getLength());
    }


    @Override
    public double calculatePerimeter() {
        return (4 * (getLength()));
    }

    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the length of one side of the Square");
        setLength(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type =" + "Square" +
                " | Side length =" + getLength() +
                " | Area =" + calculateArea() +
                " | Perimeter =" + calculatePerimeter();
    }
}
