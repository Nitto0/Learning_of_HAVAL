package prak_13.task_6;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class task_6 {
    public static String getLine(String words) {
        String[] arr = words.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[arr.length];

        sb.append(arr[0]);
        used[0] = true;

        boolean found;
        do {
            found = false;
            for (int j = 0; j < arr.length; j++) {
                if (!used[j]) {
                    // Получаем последний символ текущей строки и первый символ следующего слова
                    char lastChar = sb.charAt(sb.length() - 1);
                    char firstChar = arr[j].charAt(0);

                    // Приводим к одному регистру через преобразование в строку
                    String lastCharStr = String.valueOf(lastChar);
                    String firstCharStr = String.valueOf(firstChar);

                    if (lastCharStr.equalsIgnoreCase(firstCharStr)) {
                        sb.append(" ").append(arr[j]);
                        used[j] = true;
                        found = true;
                        break;
                    }
                }
            }
        } while (found);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            String words = fileScanner.nextLine();
            fileScanner.close();

            System.out.println(getLine(words));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
