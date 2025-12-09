package prak_17.task_2;

import java.util.Scanner;

public class EmployeeNode {
    String name;
    String position;
    int salary;
    EmployeeNode prev;
    EmployeeNode next;

    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя сотрудника: ");
        this.name = scanner.nextLine();
        System.out.print("Введите должность: ");
        this.position = scanner.nextLine();
        System.out.print("Введите зарплату: ");
        this.salary = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
    }

    public void print() {
        System.out.println("Имя: " + name + ", Должность: " + position + ", Зарплата: " + salary);
    }
}
