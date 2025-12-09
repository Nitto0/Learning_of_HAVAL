package prak_17.task_2;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeList list = new EmployeeList();

        while (true) {
            System.out.println("\n=== Картотека сотрудников (двусвязный список) ===");
            System.out.println("1. Добавить сотрудника");
            System.out.println("2. Удалить сотрудника");
            System.out.println("3. Вывести всех сотрудников (прямой порядок)");
            System.out.println("4. Вывести всех сотрудников (обратный порядок)");
            System.out.println("5. Очистить список");
            System.out.println("6. Проверить пустоту списка");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.remove();
                    break;
                case 3:
                    list.printAll();
                    break;
                case 4:
                    list.printReverse();
                    break;
                case 5:
                    list.clear();
                    break;
                case 6:
                    System.out.println("Список пуст: " + list.isEmpty());
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}
