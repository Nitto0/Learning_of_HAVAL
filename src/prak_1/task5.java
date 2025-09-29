package prak_1;

import java.util.Scanner;

public class task5 {
    public static long factorial(int num) {
        if (num <= 0) {
            return 0;
        }
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (factorial(num) != 0) {
            System.out.println(factorial(num));
        } else {
            System.out.println("n/a");
        }
    }
}
