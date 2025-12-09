package prak_6.task_1;

public class MovableCircle implements Moveable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveRight() {
        center.moveRight();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveXY(int x, int y) {
        center.x += x;
        center.y += y;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center{x = " + center.x +
                ", y = " + center.y +
                ", xSpeed = " + center.xSpeed +
                ", ySpeed = " + center.ySpeed +
                "}" +
                '}';
    }
}
