
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
}

// Derived class Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea method
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Derived class Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the calculateArea method
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to demonstrate polymorphism
public class Areas {
    public static void main(String[] args) {
        // Creating instances of different shapes
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        // Displaying the area of each shape
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}

