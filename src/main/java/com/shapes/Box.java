package com.shapes;

import java.util.Scanner;

public class Box extends Shape implements Shape3DI { //inherits from class Shape
    private Scanner scanner;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Box() {
        scanner = new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double calculateArea() {
        return (2*(getLength()*getLength()+getWidth()*getWidth()+getHeight()*getHeight()));
    }


    @Override
    public double calculateVolume() {
        return (getLength()*getWidth()*getHeight());
    }

    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Length  of the Box");
        setLength(scanner.nextInt());
        System.out.println("enter the Width  of the Box");
        setWidth(scanner.nextInt());
        System.out.println("enter the Height  of the Box");
        setHeight(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type =" + "Box" +
                " | Length =" + getLength() +
                " | Width =" + getLength() +
                " | Height =" + getLength() +
                " | Surface Area =" + calculateArea() +
                " | Volume =" + calculateVolume();
    }
}
