package prak_2;

public class task8 {
    public static void main(String[] argc) {
        String[] arr = {"acd", "qwerty", "gfds", "abre", "ldka", "poiu"};
        int size = 6;

        for (int i = 0; i < size / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
