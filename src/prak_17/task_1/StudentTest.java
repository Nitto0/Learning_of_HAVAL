package prak_17.task_1;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList list = new StudentList();

        while (true) {
            System.out.println("\n=== Картотека студентов ===");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Вывести всех студентов");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить пустоту списка");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

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
                    list.clear();
                    break;
                case 5:
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
