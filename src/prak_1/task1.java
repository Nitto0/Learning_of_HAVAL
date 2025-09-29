package prak_1;

public class task1 {
    public static void main(String[] args) {
        int[] arr = {8, 11, 3, 5};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + (float)sum/arr.length);
    }
}
