package dsa_02;

 class PointType {
    double x;
    double y;

    public PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printCoordinates() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

 class CircleType extends PointType {
    double radius;

    public CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printRadius() {
        System.out.println("Radius: " + radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class QH4 {
    public static void main(String[] args) {
        // create a point at (2, 3)
        PointType point = new PointType(2, 3);
        
        // print the coordinates of the point
        point.printCoordinates();
        
        // set the coordinates of the point to (4, 5)
        point.setCoordinates(4, 5);
        
        // print the new coordinates of the point
        point.printCoordinates();
        
        // create a circle with center at (1, 1) and radius 3
        CircleType circle = new CircleType(1, 1, 3);
        
        // print the center coordinates and radius of the circle
        circle.printCoordinates();
        circle.printRadius();
        
        // set the radius of the circle to 5
        circle.setRadius(5);
        
        // print the new radius of the circle and its area and circumference
        circle.printRadius();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
