package prak_14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class task_4 {
    public static void main(String[] args) {
        String[] tests = {
                "(1 + 8) – 9 / 4",
                "6 / 5 – 2 * 9",
                "2+3*4",
                "5 + 6+7",
                "8+ 9"
        };

        String regex = "\\d(?!\\+)";
        Pattern pattern = Pattern.compile(regex);

        for (String test : tests) {
            Matcher matcher = pattern.matcher(test);
            boolean hasDigitsWithoutPlus = false;
            String foundDigits = "";

            while (matcher.find()) {
                hasDigitsWithoutPlus = true;
                foundDigits += matcher.group() + " ";
            }

            System.out.println("Текст: " + test);
            System.out.println("Есть цифры без знака '+': " + hasDigitsWithoutPlus);
            if (hasDigitsWithoutPlus) {
                System.out.println("Найденные цифры: " + foundDigits);
            }
            System.out.println();
        }
    }
}