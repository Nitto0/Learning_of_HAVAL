package prak_9.task_1;

public class testSort {
    public static void insertionSort(Comparable<Student>[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable<Student> current = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo((Student) current) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
        }
    }

    public static void main(String[] argc) {
        Student[] students = {
                new Student(4, "Иван"),
                new Student(2, "Александр"),
                new Student(5, "Петр"),
                new Student(3, "Мария"),
                new Student(1, "Анна")
        };

        System.out.println("Исходный массив: ");
        for (Student student: students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nОтсортированный массив: ");
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
