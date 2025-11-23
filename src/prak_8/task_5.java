package prak_8;

import java.util.Scanner;

public class task_5 {
    public static int sumDig(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDig(n / 10);
    }
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = sc.nextInt();
        System.out.print("Сумма цифр: " + sumDig(n));
    }
}
