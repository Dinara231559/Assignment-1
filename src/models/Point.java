package models;

public class Point {
    private double x;
    private double y;


    public Point(double x, double y) {
        // Creating a constructor to initialize a point with given x and y coordinates
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point destination) {
        // Creating a method to calculate and return distance from current point to the destination point
        double distance;
        double difference_x = this.x - destination.x;
        double difference_y = this.y - destination.y;
        distance = Math.sqrt(difference_x * difference_x + difference_y * difference_y);

        return distance;
    }

    public String toString() {
        // Creating method to provide a string representation of the point in the format (x,y)
        return "(" + x + "," + y + ")";
    }
}






