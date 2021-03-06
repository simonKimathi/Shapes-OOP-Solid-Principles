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
        while(choice != 0) {
            System.out.println("select 1 to create rectangle instance \n" +
                    "1 to create rectangle instance \n" +
                    "2 to create Square instance \n" +
                    "3 to create Box instance \n" +
                    "4 to create Cube instance \n" +
                    "5 to create Ellipse instance \n" +
                    "6 to create Circle instance \n" +
                    "7 to create Sphere instance \n" +
                    "8 to create Triangle instance \n" +
                    "9 to create Tetrahedron instance \n" +
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
                        break;
                    default:
                        System.out.println("invalid Option");
                        break;

                }

        }

        shapes.forEach((s) -> System.out.println(s));



    }
}
