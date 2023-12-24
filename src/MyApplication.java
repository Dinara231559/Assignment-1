import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Dinara Abdukhamitova\\IdeaProjects\\Assignment 1\\src\\Coords");

        // Creating a Scanner to read data from the source file
        Scanner sc = new Scanner(file);
        // Creating a Shape object to store points
        Shape shape = new Shape();

        while (sc.hasNext()) { // Reading coordinates from the file and adding points to the Shape
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);

        }

        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest side: " + shape.getLongestSide());
        System.out.println("Average side: " + shape.getAverageSide());
    }


}