package prak_6.task_1;

import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();

        System.out.print("Y: ");
        int y = sc.nextInt();

        circle.moveXY(x, y);
        System.out.println(circle);
    }
}
