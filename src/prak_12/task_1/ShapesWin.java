package prak_12.task_1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class ShapesWin extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawShapes(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void drawShapes(Graphics g) {
        Random random = new Random();
        Shape[] shapes = new Shape[20];

        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(700);
            int y = random.nextInt(500);

            if (random.nextBoolean()) {
                shapes[i] = new Circle(color, x, y, 10 + random.nextInt(50));
            } else {
                shapes[i] = new Rectangle(color, x, y, 20 + random.nextInt(100), 20 + random.nextInt(100));
            }
        }

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}