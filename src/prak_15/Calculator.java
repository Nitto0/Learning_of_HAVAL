package prak_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton addButton = new JButton("Сложить");
    JButton subtractButton = new JButton("Вычесть");
    JButton multiplyButton = new JButton("Умножить");
    JButton divideButton = new JButton("Разделить");

    Calculator() {
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(250, 200);

        add(new JLabel("1-е число"));
        add(jta1);
        add(new JLabel("2-е число"));
        add(jta2);

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);

        // Обработчик для сложения
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат: " + (x1 + x2),
                            "Результат", JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка в числах!",
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Обработчик для вычитания
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат: " + (x1 - x2),
                            "Результат", JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка в числах!",
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Обработчик для умножения
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат: " + (x1 * x2),
                            "Результат", JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка в числах!",
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Обработчик для деления
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    if (x2 == 0) {
                        JOptionPane.showMessageDialog(null, "Деление на ноль!",
                                "Ошибка", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Результат: " + (x1 / x2),
                                "Результат", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка в числах!",
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}