// Shape interface with an abstract draw method
interface Shape {
    void draw();
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Square class implementing the Shape interface
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

// Main class to test the implementations
public class Main {
    public static void main(String[] args) {
        // Creating objects of Circle and Square classes
        Shape circle = new Circle();
        Shape square = new Square();

        // Calling draw method on Circle and Square objects
        circle.draw();
        square.draw();
    }
}

Output:

Drawing a circle
Drawing a square
