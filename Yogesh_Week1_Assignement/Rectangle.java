public class Rectangle {

    // Attributes
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor with one parameter (for a square)
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters (for a rectangle)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area (no parameters)
    public double calculateArea() {
        return length * width;
    }

    // Overloaded method to calculate area with different dimensions
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to display the dimensions of the rectangle
    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Using the default constructor
        Rectangle rect1 = new Rectangle();
        rect1.displayDimensions();
        System.out.println("Area: " + rect1.calculateArea());

        // Using the constructor with one parameter (square)
        Rectangle rect2 = new Rectangle(5);
        rect2.displayDimensions();
        System.out.println("Area: " + rect2.calculateArea());

        // Using the constructor with two parameters
        Rectangle rect3 = new Rectangle(4, 7);
        rect3.displayDimensions();
        System.out.println("Area: " + rect3.calculateArea());

        // Using the overloaded method to calculate area with different dimensions
        System.out.println("Overloaded Method Area: " + rect3.calculateArea(3, 6));
    }
}
