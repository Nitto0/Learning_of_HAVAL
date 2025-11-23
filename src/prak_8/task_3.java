package prak_8;

import java.util.Scanner;

public class task_3 {
    public static int printNum(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            return printNum(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            return printNum(a - 1, b);
        }
        System.out.print(a);
        return 0;
    }
    public static void main(String[] argc) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введи А: ");
        a = sc.nextInt();
        System.out.print("Введи B: ");
        b = sc.nextInt();

        printNum(a, b);
    }
}
