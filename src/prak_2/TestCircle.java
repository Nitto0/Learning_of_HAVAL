package prak_2;

public class TestCircle {
    public static void main(String[] argc) {
        Point p1 = new Point(2, 5);
        Circle c1 = new Circle(p1, 5);

        System.out.println(c1.getCenter());
        System.out.println("Radius = " + c1.getRadius());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimetr = " + c1.getPerimetr());

        Point p2 = new Point(1, 1);
        c1.setCenter(p2);
        c1.setRadius(3);

        System.out.println(c1.getCenter());
        System.out.println("Radius = " + c1.getRadius());
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimetr = " + c1.getPerimetr());
    }
}
