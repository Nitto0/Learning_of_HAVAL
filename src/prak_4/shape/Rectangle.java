package prak_4.shape;

public class Rectangle extends Shape {
    public double a;
    public double b;

    public Rectangle(String type, double a, double b) {
        super(type);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * a + 2.0 * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", sh_type='" + sh_type + '\'' +
                '}';
    }
}
