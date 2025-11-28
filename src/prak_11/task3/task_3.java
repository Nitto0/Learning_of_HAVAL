package prak_11.task3;

import java.util.Date;

public class task_3 {
    public static void main(String[] args) {
        Date birthDate = new Date(102, 7, 15); // 15 августа 2002

        Student student = new Student("Иван Иванов", birthDate);

        System.out.println(student);
        System.out.println("Короткий формат: " + student.getBirthDate("short"));
        System.out.println("Полный формат: " + student.getBirthDate("full"));
    }
}
