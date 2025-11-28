package prak_9.task_2;

import java.util.*;

public class testQuickSort {
    public static void quickSort(Student[] arr, int low, int high, Comparator<Student> comp) {
        if (low < high) {
            int pivotIndex = part(arr, low, high, comp);
            quickSort(arr, low, pivotIndex - 1, comp);
            quickSort(arr, pivotIndex + 1, high, comp);
        }
    }

    private static int part(Student[] arr, int low, int high, Comparator<Student> comp) {
        Student pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comp.compare(arr[j], pivot) > 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] argc) {
        Student[] students = {
                new Student(5, "Иван", 4.2),
                new Student(3, "Петр", 3.8),
                new Student(1, "Мария", 4.7),
                new Student(2, "Анна", 4.1),
                new Student(4, "Сергей", 3.9)
        };

        System.out.println("До сортировки:");
        for (Student s : students) System.out.println(s);

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        quickSort(students, 0, students.length - 1, comparator);

        System.out.println("\nПосле сортировки (по убыванию GPA):");
        for (Student s : students) System.out.println(s);
    }
}
