package prak_15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CountrySelector extends JFrame {
    String[] countries = {"Австралия", "Китай", "Англия", "Россия"};
    String[] countryInfo = {
            "Столица: Канберра\nНаселение: 25 млн.\nЯзык: английский",
            "Столица: Пекин\nНаселение: 1.4 млрд.\nЯзык: китайский",
            "Столица: Лондон\nНаселение: 56 млн.\nЯзык: английский",
            "Столица: Москва\nНаселение: 146 млн.\nЯзык: русский"
    };

    JComboBox<String> countryCombo = new JComboBox<>(countries);
    JTextArea infoArea = new JTextArea(10, 25);

    CountrySelector() {
        super("Выбор страны");
        setLayout(new FlowLayout());
        setSize(350, 250);

        add(new JLabel("Выберите страну:"));
        add(countryCombo);

        infoArea.setEditable(false);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(infoArea);
        add(scrollPane);

        // Обработчик выбора страны
        countryCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int selectedIndex = countryCombo.getSelectedIndex();
                if (selectedIndex >= 0 && selectedIndex < countryInfo.length) {
                    infoArea.setText(countryInfo[selectedIndex]);
                }
            }
        });

        infoArea.setText(countryInfo[0]);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CountrySelector();
    }
}