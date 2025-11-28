package prak_11;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY, 0);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        Date currentDate = now.getTime();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        if (year < 0) {
            System.out.println("Неправильно введ год");
            return;
        }

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Неправильно введен месяц");
            return;
        }

        System.out.print("Введите число: ");
        int day = scanner.nextInt();
        if ((day < 1 || day > 31) ||
            (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) ||
            (day > 28 && month == 2)) {
            System.out.println("Неправильно введен день");
            return;
        }

        Calendar inputCal = Calendar.getInstance();
        inputCal.set(year, month - 1, day, 0, 0, 0);
        Date inputDate = inputCal.getTime();

        System.out.println("Текущая дата: " + currentDate);
        System.out.println("Введенная дата: " + inputDate);

        if (inputDate.before(currentDate)) {
            System.out.println("Введенная дата была РАНЬШЕ");
        } else if (inputDate.after(currentDate)) {
            System.out.println("Введенная дата будет ПОЗЖЕ");
        } else {
            System.out.println("Даты РАВНЫ");
        }
    }
}