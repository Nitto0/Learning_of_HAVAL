package prak_6.task_1;

public class testMovable {
    public static void main(String[] argc) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point);

        point.moveUp();
        point.moveLeft();
        System.out.println("После moveUp и moveLeft: " + point + "\n");

        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 3);
        System.out.println(circle);

        circle.moveDown();
        circle.moveRight();
        System.out.println("После moveDown и moveRight: " + circle);
    }
}
