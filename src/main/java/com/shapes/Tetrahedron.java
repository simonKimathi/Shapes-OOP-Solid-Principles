package com.shapes;

import java.util.Scanner;

public class Tetrahedron extends Shape implements Shape3DI { //inherits from class Shape
    private Scanner scanner;
    public Tetrahedron() {
        scanner = new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double calculateArea() {
        // √3 × (Edge Length)2
        return (2*(getLength()*getLength()+getWidth()*getWidth()));
    }


    @Override
    public double calculateVolume() {
        //√2/12 × (Edge Length)3
        return (getLength()*getWidth());
    }

    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Length  of the Box");
        setLength(scanner.nextInt());
        System.out.println("enter the Width  of the Box");
        setWidth(scanner.nextInt());
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
