abstract class Shape {

    // abstract method (must override)
    abstract double area();

    // normal method
    void display() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

public class AbstractClassEg1 {
    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.display();
        System.out.println(s.area());

        s = new Rectangle(4, 6);
        System.out.println(s.area());
    }
}