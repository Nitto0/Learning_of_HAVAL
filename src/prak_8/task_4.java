package prak_8;

import java.util.Scanner;

public class task_4 {
    public static int countSums(int k, int s, int sum, int len) {
        if (len == k) {
            return (sum == s) ? 1 : 0;
        }

        int count = 0;
        int start = (len == 0) ? 1 : 0;

        for (int num = start; num <= 9; num++) {
            if (sum + num <= s) {
                count += countSums(k, s, sum + num, len + 1);
            }
        }
        return count;
    }

    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);

        int k, s;
        System.out.print("Введите k: ");
        k = sc.nextInt();

        System.out.print("Введите s: ");
        s = sc.nextInt();

        System.out.println(countSums(k, s, 0, 0));
    }
}
