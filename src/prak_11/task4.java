package prak_11;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату и время:");
        System.out.print("Год: ");
        int year = scanner.nextInt();
        if (year < 0) {
            System.out.println("Неправильно введен год");
            return;
        }

        System.out.print("Месяц: ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Неправильно введен месяц");
            return;
        }

        System.out.print("Число: ");
        int day = scanner.nextInt();
        if ((day < 1 || day > 32) ||
            (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) ||
            (day > 28 && month == 2)) {
            System.out.println("Неправильно введен день");
            return;
        }

        System.out.print("Часы: ");
        int hours = scanner.nextInt();
        if (hours < 0 || hours > 23) {
            System.out.println("Неправильно введены часы ");
            return;
        }

        System.out.print("Минуты: ");
        int minutes = scanner.nextInt();
        if (minutes < 0 || minutes > 59) {
            System.out.println("Неправильно введены минуты");
            return;
        }

        Date dateObj = new Date(year - 1900, month - 1, day, hours, minutes);

        Calendar calObj = Calendar.getInstance();
        calObj.set(year, month - 1, day, hours, minutes);

        SimpleDateFormat format = new SimpleDateFormat("<yyyy><MM><dd>\n<HH><mm>");

        System.out.println("\nОбъект Date:");
        System.out.println(format.format(dateObj));

        System.out.println("\nОбъект Calendar:");
        System.out.println(format.format(calObj.getTime()));
    }
}