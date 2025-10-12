package prak_3;

import java.util.Random;

public class task_1_1 {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] argc) {
        int[] arr1 = new int[10];

        System.out.println("Метод Math.random()");
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
            System.out.print(arr1[i] + " ");
        }

        sort(arr1);
        System.out.print("\nОтсортированный массив: ");
        for (int el : arr1) {
            System.out.print(el + " ");
        }

        System.out.println("\n\nМетод Random");
        Random random = new Random();
        int[] arr2 = new int[10];

        System.out.print("Исходный массив: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100);
            System.out.print(arr2[i] + " ");
        }

        System.out.print("\nОтсортированный массив: ");
        sort(arr2);
        for (int el: arr2) {
            System.out.print(el + " ");
        }
    }
}
