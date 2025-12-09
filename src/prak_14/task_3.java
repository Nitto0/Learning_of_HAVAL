package prak_14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class task_3 {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 0.004 EU, 100 RUB, 50.50 EU, 123.45 USD";

        String regex = "\\d+\\.?\\d*\\s+(USD|RUB|EU)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}