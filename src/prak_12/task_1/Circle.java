package prak_12.task_1;

import java.awt.*;

class Circle extends Shape {
    int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}
