package com.shapes;

import java.util.Scanner;

public class Sphere extends Shape implements Shape3DI { //inherits from class Shape
    private Scanner scanner;

    public Sphere() {
        scanner = new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double calculateArea() {
        // 4 × π × r2
        return 4*3.14*(Math.pow(getLength(),2));
    }


    @Override
    public double calculateVolume() {
        //(4/3) × π × r3
        return (4/3)*3.14*(Math.pow(getLength(),3));
    }

    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Radius  of the Sphere");
        setLength(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type =" + "Sphere" +
                " | Radius =" + getLength() +
                " | Surface Area =" + calculateArea() +
                " | Volume =" + calculateVolume();
    }
}
