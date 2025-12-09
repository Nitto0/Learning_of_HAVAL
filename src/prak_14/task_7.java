package prak_14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class task_7 {
    public static void main(String[] args) {
        String[] passwords = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007"
        };

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
        Pattern pattern = Pattern.compile(regex);

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);
            boolean isStrong = matcher.matches();
            System.out.println("Пароль: " + password + " - " + (isStrong ? "надежный" : "ненадежный"));
        }
    }
}