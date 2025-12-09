package prak_6.task_2;

public class testMovable {
    public static void main(String[] argc) {
        MovableRectangle rect = new MovableRectangle(0, 5, 5, 0, 1, 1);
        System.out.println(rect + "\n");

        rect.moveUp();
        System.out.println("После moveUp: " + rect + "\n");

        rect.moveRight();
        System.out.println("После moveRight: " + rect);


    }
}
