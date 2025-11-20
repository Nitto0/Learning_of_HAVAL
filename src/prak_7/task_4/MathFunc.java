package prak_7.task_4;

public class MathFunc implements MathCalculable{
    public double power(double base, double step) {
        return Math.pow(base, step);
    }

    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double CircleLength(double radius) {
        return 2 * PI * radius;
    }

    public double CircleArea(double radius) {
        return PI * power(radius, 2);
    }
}
