package com.shapes;

import java.util.Scanner;

public abstract class Shape implements ShapeI{
    private int length;
    private int width;
    //default constructor
    public Shape(){

    }
    //method to get the length
    public int getLength() {
        return length;
    }
    //method to set the length
    public void setLength(int length) {
        this.length = Math.abs(length);
    }
    //method to get the width
    public int getWidth() {
        return width;
    }
    //method to set the width
    public void setWidth(int width) {
        this.width = Math.abs(width);
    }


    public abstract void prompt(Scanner scanner);

}
