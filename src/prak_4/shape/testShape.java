package prak_4.shape;

public class testShape {
    public static void main(String[] argc) {
        Shape circle = new Circle("Circle", 5);
        Shape square = new Square("Square", 5);
        Shape rect = new Rectangle("Rectangle", 3, 4);

        System.out.println(circle.getType());
        System.out.println(square.getType());
        System.out.println(rect.getType() + "\n");

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Square area: " + square.getArea());
        System.out.println("Rectangle area: " + rect.getArea() + "\n");

        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Rectangle perimeter: " + rect.getPerimeter() + "\n");

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rect + "\n");
    }
}
