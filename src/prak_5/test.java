package prak_5;

import java.awt.*;
import javax.swing.*;

public class test {
    public static void main(String[] argc) {
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        //создали панель
        JPanel panel= new JPanel();

        //задали свойство панели – цвет фона
        panel.setBackground(Color.GRAY);

        // задали свойство панели размеры
        panel.setPreferredSize(new Dimension(200,300));
        JButton button1 = new JButton("+");
        JButton button2 = new JButton("-");
        panel.add(button1);
        panel.add(button2);

        JLabel label = new JLabel("0", JLabel.CENTER);
        panel.add(label);

        //добавили панель к фрейму
        frame.getContentPane().add(panel);

        //упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
} 