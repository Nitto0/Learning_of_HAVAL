package prak_17.task_1;

import java.util.Scanner;

public class StudentNode {
    String name;
    int age;
    StudentNode next;

    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст студента: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
    }

    public void print() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
