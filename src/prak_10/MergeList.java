package prak_10;

import java.util.*;

public class MergeList {
    public static void main(String[] args) {
        List<Student> list1 = Arrays.asList(
                new Student("Иван", "Иванов", "Информатика", 3, "ИС-31", 4.2),
                new Student("Петр", "Петров", "Математика", 2, "М-22", 3.8)
        );

        List<Student> list2 = Arrays.asList(
                new Student("Мария", "Сидорова", "Информатика", 4, "ИС-41", 4.7),
                new Student("Анна", "Козлова", "Физика", 3, "Ф-33", 4.1)
        );

        List<Student> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);

        merged.sort((a, b) -> Double.compare(b.getGpa(), a.getGpa()));

        System.out.println("Объединенный список:");
        for (Student s : merged) {
            System.out.println(s);
        }
    }
}
