package prak_4.shape;

public class Shape {
    public String sh_type;

    public Shape(String type) {
        this.sh_type = type;
    }

    public String getType() {
        return "Тип фигуры: " + sh_type;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "sh_type='" + sh_type + '\'' +
                '}';
    }
}
