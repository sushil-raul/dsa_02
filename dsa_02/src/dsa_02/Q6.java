package dsa_02;

abstract class Shape {
    abstract double getArea();
}

class Square extends Shape {
    double side;

    Square(double s) {
        side = s;
    }

    double getArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double getArea() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Square s = new Square(5);
        Triangle t = new Triangle(6, 8);
        Circle c = new Circle(3);

        System.out.println("Area of square with side " + s.side + " is " + s.getArea());
        System.out.println("Area of triangle with base " + t.base + " and height " + t.height + " is " + t.getArea());
        System.out.println("Area of circle with radius " + c.radius + " is " + c.getArea());
    }
}
