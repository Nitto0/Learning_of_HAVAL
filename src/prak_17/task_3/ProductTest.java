package prak_17.task_3;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductList list = new ProductList();

        while (true) {
            System.out.println("\n=== Картотека товаров (кольцевой список) ===");
            System.out.println("1. Добавить товар");
            System.out.println("2. Удалить товар");
            System.out.println("3. Вывести все товары");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить пустоту списка");
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
