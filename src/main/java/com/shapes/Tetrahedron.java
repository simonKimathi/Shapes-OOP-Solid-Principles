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
        return (Math.cbrt(Math.pow(getLength(),2)));
    }


    @Override
    public double calculateVolume() {
        //√2/12 × (Edge Length)3
        return ((Math.sqrt(Math.pow(getLength(),3)))/12);
    }

    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Edge  of the Tetrahedron");
        setLength(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type =" + "Tetrahedron" +
                " | Edge =" + getLength() +
                " | Surface Area =" + calculateArea() +
                " | Volume =" + calculateVolume();
    }
}
