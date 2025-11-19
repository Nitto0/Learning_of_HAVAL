package prak_4.shape;

public class Square extends Shape {
    public double a;

    public Square(String type, double a) {
        super(type);
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4.0 * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", sh_type='" + sh_type + '\'' +
                '}';
    }
}
