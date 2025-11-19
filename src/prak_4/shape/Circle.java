package prak_4.shape;

public class Circle extends Shape {
    public double radius;

    public Circle(String type, double radius) {
        super(type);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", sh_type='" + sh_type + '\'' +
                '}';
    }
}
