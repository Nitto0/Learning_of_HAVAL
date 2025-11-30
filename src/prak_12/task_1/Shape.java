package prak_12.task_1;

import java.awt.*;

abstract class Shape {
    Color color;
    int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}