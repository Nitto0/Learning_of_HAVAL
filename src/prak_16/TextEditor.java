package prak_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEditor extends JFrame {
    JTextArea textArea = new JTextArea(15, 30);
    JMenuBar menuBar = new JMenuBar();

    TextEditor() {
        super("Редактор текста");
        setLayout(new FlowLayout());
        setSize(400, 350);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });

        redItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });

        blackItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesItem = new JMenuItem("Times New Roman");
        JMenuItem sansItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierItem = new JMenuItem("Courier New");
        
        timesItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            }
        });

        sansItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });

        courierItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });

        fontMenu.add(timesItem);
        fontMenu.add(sansItem);
        fontMenu.add(courierItem);
        
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        
        setJMenuBar(menuBar);
        
        textArea.setText("Введите ваш текст здесь...");
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditor().setVisible(true);
            }
        });
    }
}