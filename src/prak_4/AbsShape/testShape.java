package prak_4.AbsShape;

public class testShape {
    public static void main(String[] argc) {
        Shape circle = new Circle(5.0, "red", true);
        Shape rect = new Rectangle(4.0, 5.0, "blue", false);
        Shape square = new Square(5.0, "black", false);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Rectangle area: " + rect.getArea() + "\n");

        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter() + "\n");

        System.out.println(circle.toString());
        System.out.println(square.toString());
        System.out.println(rect.toString() + "\n");
    }
}
