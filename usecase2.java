abstract class Shape {
    abstract double area();

    void displayArea() {
        System.out.println("area=" + area());

    }
}

class Circle extends Shape {
    double r;

    Circle(double radius) {
        this.r = radius;
    }

    @Override
    double area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double length, double breadth) {
        this.l = length;
        this.b = breadth;
    }

    @Override
    double area() {
        return l * b;
    }
}

public class usecase2 {
    public static void main(String args[]) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4, 6);
        for (Shape s : shapes) {
            s.displayArea();
        }

    }
}