package com.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        List<String> shapes=new ArrayList<>();

        int choice=1;

        System.out.println("welcome");
        choice=scanner.nextInt();
        while(choice != 0) {
            System.out.println("select 1 to create rectangle instance" +
                    "1 to create rectangle instance" +
                    "2 to create rectangle instance" +
                    "3 to create rectangle instance" +
                    "4 to create rectangle instance" +
                    "5 to create rectangle instance" +
                    "6 to create rectangle instance" +
                    "7 to create rectangle instance" +
                    "8 to create rectangle instance" +
                    "9 to create rectangle instance" +
                    "0 exit");
            choice=scanner.nextInt();
                switch (choice) {
                    case 1:
                        Shape rect = new Rectangle();
                        shapes.add(rect.toString());
                        break;
                    case 2:
                        Shape square = new Square();
                        shapes.add(square.toString());
                        break;
                    case 3:
                        Shape box = new Box();
                        shapes.add(box.toString());
                        break;
                    case 4:
                        Shape cube = new Cube();
                        shapes.add(cube.toString());
                        break;
                    case 5:
                        Shape ellipse = new Ellipse();
                        shapes.add(ellipse.toString());
                        break;
                    case 6:
                        Shape circle = new Circle();
                        shapes.add(circle.toString());
                        break;
                    case 7:
                        Shape sphere = new Sphere();
                        shapes.add(sphere.toString());
                        break;
                    case 8:
                        Shape triangle = new Triangle();
                        shapes.add(triangle.toString());
                        break;
                    case 9:
                        Shape tetrahedron = new Tetrahedron();
                        shapes.add(tetrahedron.toString());
                        break;
                    case 0:
                        System.out.println("Thank you for using this program");
                    default:
                        System.out.println("invalid Option");
                        break;

                }

        }

        shapes.forEach((s) -> System.out.println(s));



    }
}
