package prak_10;

import java.util.Comparator;

public class SortingStudentsByGPA {
    private Student[] iDNumber;

    static class GPAComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Double.compare(b.getGpa(), a.getGpa());
        }
    }

    public void setArray(Student[] students) {
        iDNumber = students;
    }

    private void quicksort(int low, int high, Comparator<Student> comp) {
        if (low < high) {
            int pivotIndex = partition(low, high, comp);
            quicksort(low, pivotIndex - 1, comp);
            quicksort(pivotIndex + 1, high, comp);
        }
    }

    private int partition(int low, int high, Comparator<Student> comp) {
        Student pivot = iDNumber[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comp.compare(iDNumber[j], pivot) < 0) {
                i++;
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
            }
        }

        Student temp = iDNumber[i + 1];
        iDNumber[i + 1] = iDNumber[high];
        iDNumber[high] = temp;

        return i + 1;
    }

    private Student[] mergeSort(Student[] array, Comparator<Student> comp) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        left = mergeSort(left, comp);
        right = mergeSort(right, comp);

        return merge(left, right, comp);
    }

    private Student[] merge(Student[] left, Student[] right, Comparator<Student> comp) {
        Student[] result = new Student[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (comp.compare(left[i], right[j]) > 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        Student[] students = {
                new Student("Иван", "Иванов", "Информатика", 3, "ИС-31", 4.2),
                new Student("Петр", "Петров", "Математика", 2, "М-22", 3.8),
                new Student("Мария", "Сидорова", "Информатика", 4, "ИС-41", 4.7),
                new Student("Анна", "Козлова", "Физика", 3, "Ф-33", 4.1)
        };

        sorter.setArray(students);

        System.out.println("Исходный массив:");
        sorter.outArray();

        System.out.println("\nБыстрая сортировка по GPA:");
        sorter.quicksort(0, students.length - 1, new GPAComparator());
        sorter.outArray();

        Student[] students2 = {
                new Student("Иван", "Иванов", "Информатика", 3, "ИС-31", 4.2),
                new Student("Петр", "Петров", "Математика", 2, "М-22", 3.8),
                new Student("Мария", "Сидорова", "Информатика", 4, "ИС-41", 4.7),
                new Student("Анна", "Козлова", "Физика", 3, "Ф-33", 4.1)
        };
        sorter.setArray(students2);

        System.out.println("\nСортировка слиянием по GPA:");
        sorter.mergeSort(students2, new GPAComparator());
        sorter.outArray();
    }
}
