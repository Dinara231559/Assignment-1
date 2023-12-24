package models;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>();


    public void addPoint(Point point) { // Creating a method to add points to the list
        points.add(point);
    }

    public double calculatePerimeter() { // Creating a method to calculate a perimeter of the shape
        double perimeter = 0.0;
        int n = points.size();

        for (int i = 0; i < n; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % n);
            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }

    public double getLongestSide() { // Creating a method to find the max length of the sides of the shape
        double maxLength = 0.0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            double sideLength = currentPoint.distanceTo(nextPoint);

            if (sideLength > maxLength) {
                maxLength = sideLength;
            }
        }

        return maxLength;
    }

    public double getAverageSide() { // Creating a method to calculate the average length of the sides of the shape
        double totalLength = 0.0;
        int n = points.size();

        for (int i = 0; i < n; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % n);
            totalLength += currentPoint.distanceTo(nextPoint);
        }

        return totalLength / n;
    }

}


