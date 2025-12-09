package prak_12.task_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Анимация 6 кадров");
        frame.setSize(150, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel label = new JLabel();
        frame.add(label);

        ImageIcon[] frames = new ImageIcon[6];
        for (int i = 0; i < 6; i++) {
            frames[i] = createFrame(i);
        }

        Timer timer = new Timer(100, new ActionListener() {
            int currentFrame = 0;

            public void actionPerformed(ActionEvent e) {
                label.setIcon(frames[currentFrame++]);
                currentFrame = (currentFrame) % 6;
            }
        });

        timer.start();
        frame.setVisible(true);
    }

    public static ImageIcon createFrame(int frameNumber) {
        return new ImageIcon("src/prak_12/task_3/frame" + frameNumber + ".jpg");
    }
}