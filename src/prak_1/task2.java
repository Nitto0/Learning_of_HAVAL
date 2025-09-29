package prak_1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0, j = 0;

        while (j < size) {
            sum += arr[j];
            j++;
        }
        System.out.println("Сумма (while): " + sum);

        sum = 0;
        j = 0;
        do {
            sum += arr[j];
            j++;
        } while (j < size);

        System.out.println("Сумма (do while): " + sum);

        int max = -100000, min = 1000000;
        for (int i = 0; i < size; i++)  {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
