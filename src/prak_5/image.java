package prak_5;

import javax.swing.*;

public class image {
    public static void main(String[] argc) {
        if (argc.length == 0) {
            System.out.println("Укажите имя файла картинки в аргументах");
            return;
        }

        String imageName = argc[0] + " " + argc[1];
        System.out.print(imageName);

        JFrame frame = new JFrame("Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        ImageIcon imageIcon = new ImageIcon(imageName);

        if (imageIcon.getIconWidth() == -1) {
            JLabel errorLabel = new JLabel("Не могу найти файл: " + imageName);
            errorLabel.setHorizontalAlignment(JLabel.CENTER);
            frame.add(errorLabel);
        } else {
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setHorizontalAlignment(JLabel.CENTER);
            frame.add(imageLabel);
        }

        frame.setVisible(true);
    }
}
