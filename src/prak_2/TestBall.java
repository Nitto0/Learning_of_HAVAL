package prak_2;

public class TestBall {
    public static void main(String[] argc) {
        Ball b1 = new Ball(2, 3);
        Ball b2 = new Ball(4, -1);

        System.out.println(b1.toString());
        System.out.println(b2.toString());

        System.out.println("x1 - x2 = " + (b1.getX() - b2.getX()));
        System.out.println("y1 - y2 = " + (b1.getY() - b2.getY()));

        b1.setX(5);
        b1.setY(10);
        System.out.println(b1.toString());

        b2.setXY(5, 5);
        System.out.println(b2.toString());

        b2.move(-5, -5);
        System.out.println(b2.toString());
    }
}
