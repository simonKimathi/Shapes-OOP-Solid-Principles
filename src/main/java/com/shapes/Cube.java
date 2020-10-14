package com.shapes;

import java.util.Scanner;

public class Cube extends Box { //inherits from class box
    private Scanner scanner;

    public Cube() {
        scanner = new Scanner(System.in);
        prompt(scanner);
    }

    @Override
    public double calculateArea() {
        return (12*(getLength()*getLength()));
    }


    @Override
    public double calculateVolume() {
        return (getLength()*getLength()*getLength());
    }

    @Override
    public void prompt(Scanner scanner){
        System.out.println("enter the Length  of the Cube");
        setLength(scanner.nextInt());
    }

    @Override
    public String toString() {
        return "Shape type =" + "Cube" +
                " | Length =" + getLength() +
                " | Surface Area =" + calculateArea() +
                " | Volume =" + calculateVolume();
    }
}
