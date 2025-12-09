package prak_14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class task_2 {
    public static void main(String[] args) {
        String[] tests = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340"
        };

        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);

        for (String test : tests) {
            Matcher matcher = pattern.matcher(test);
            boolean matches = matcher.matches();
            System.out.println("Строка: " + test);
            System.out.println("Соответствует шаблону: " + matches);
            System.out.println();
        }
    }
}
