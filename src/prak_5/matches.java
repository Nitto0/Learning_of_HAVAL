package prak_5;

import java.awt.*;
import javax.swing.*;

public class matches {
    static int madridScore = 0;
    static int milanScore = 0;
    static String lastScorer = "N/A";
    static String winner = "DRAW";

    public static void main(String[] argc) {
        JFrame frame = new JFrame("Real Madrid vs AC Milan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(325, 325);

        JPanel main_pan = new JPanel();
        main_pan.setBackground(Color.CYAN);
        main_pan.setPreferredSize(new Dimension(325, 325));

        JPanel but_panel = new JPanel();
        but_panel.setBackground(Color.CYAN);

        JButton but1 = new JButton("AC Milan");
        JButton but2 = new JButton("Real Madrid");

        but_panel.add(but1);
        but_panel.add(but2);

        JLabel res = new JLabel("Result: 0 X 0", JLabel.CENTER);
        res.setPreferredSize(new Dimension(300, 30));
        res.setOpaque(true);
        res.setBackground(Color.LIGHT_GRAY);

        JLabel last_sc = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        last_sc.setPreferredSize(new Dimension(300, 30));
        last_sc.setOpaque(true);
        res.setBackground(Color.LIGHT_GRAY);

        Label win = new Label("Winner: ", Label.CENTER);
        win.setPreferredSize(new Dimension(300, 30));
        win.setBackground(Color.LIGHT_GRAY);

        main_pan.add(but_panel, BorderLayout.CENTER);
        main_pan.add(res, BorderLayout.SOUTH);
        main_pan.add(last_sc, BorderLayout.SOUTH);
        main_pan.add(win, BorderLayout.SOUTH);

        frame.getContentPane().add(main_pan);

        but1.addActionListener(e -> {
            milanScore++;
            lastScorer = "AC Milan";
            updateScores(res, last_sc, win);
        });

        but2.addActionListener(e -> {
            madridScore++;
            lastScorer = "Real Madrid";
            updateScores(res, last_sc, win);
        });

        frame.pack();
        frame.setVisible(true);
    }

    private static void updateScores(JLabel res, JLabel last_sc, Label win) {
        res.setText("Result: " + milanScore + " X " + madridScore);
        last_sc.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winner = "AC Milan";
        } else if (madridScore > milanScore) {
            winner = "Real Madrid";
        } else {
            winner = "DRAW";
        }

        win.setText("Winner: " + winner);
    }
}
