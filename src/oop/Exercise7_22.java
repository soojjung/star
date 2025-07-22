package oop;

public class Exercise7_22 {
    public static void main(String[] args) {
        Circle c = new Circle(new MyPoint(2, 3), 5);
        System.out.println("면적: " + c.calcArea());
        System.out.println("위치: " + c.getPosition());

        Rectangle rectangle = new Rectangle(new MyPoint(2, 3), 4, 5);
        System.out.println("면적: " + rectangle.calcArea());
        System.out.println("위치: " + rectangle.isSquare());
    }
}

class Circle extends Shape {
    double r;

    Circle(MyPoint p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    double calcArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(MyPoint p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width * height;
    }

    boolean isSquare() {
        return width == height;
    }
}

abstract class Shape {
    MyPoint p;

    Shape() {
        this(new MyPoint(0, 0));
    }

    Shape(MyPoint p) {
        this.p = p;
    }

    abstract double calcArea();

    MyPoint getPosition() {
        return p;
    }

    void setPosition(MyPoint p) {
        this.p = p;
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint() {
        this(0, 0);
    }

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}