package prak_17.task_3;

import java.util.Scanner;

public class ProductList {
    ProductNode head;

    public ProductList() {
        head = null;
    }

    public void add() {
        ProductNode newNode = new ProductNode();
        newNode.readFromConsole();

        if (head == null) {
            head = newNode;
            head.next = head; // делаем кольцо
        } else {
            ProductNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        System.out.println("Товар добавлен в список.");
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Список пуст. Удалять нечего.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара для удаления: ");
        String nameToRemove = scanner.nextLine();

        // Если удаляем первый элемент
        if (head.name.equals(nameToRemove)) {
            if (head.next == head) { // если только один элемент
                head = null;
            } else {
                ProductNode current = head;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = head.next;
                head = head.next;
            }
            System.out.println("Товар удален.");
            return;
        }

        // Ищем товар для удаления
        ProductNode current = head;
        while (current.next != head && !current.next.name.equals(nameToRemove)) {
            current = current.next;
        }

        if (current.next != head) {
            current.next = current.next.next;
            System.out.println("Товар удален.");
        } else {
            System.out.println("Товар с таким названием не найден.");
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        System.out.println("Список товаров:");
        ProductNode current = head;
        int count = 1;
        do {
            System.out.print(count + ". ");
            current.print();
            current = current.next;
            count++;
        } while (current != head);
    }

    public void clear() {
        head = null;
        System.out.println("Список очищен.");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
