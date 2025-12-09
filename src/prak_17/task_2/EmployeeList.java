package prak_17.task_2;

import java.util.Scanner;

public class EmployeeList {
    EmployeeNode head;
    EmployeeNode tail;

    public EmployeeList() {
        head = null;
        tail = null;
    }

    public void add() {
        EmployeeNode newNode = new EmployeeNode();
        newNode.readFromConsole();

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        System.out.println("Сотрудник добавлен в список.");
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Список пуст. Удалять нечего.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя сотрудника для удаления: ");
        String nameToRemove = scanner.nextLine();

        EmployeeNode current = head;
        while (current != null && !current.name.equals(nameToRemove)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Сотрудник с таким именем не найден.");
            return;
        }

        if (current == head && current == tail) {
            head = null;
            tail = null;
        } else if (current == head) {
            head = head.next;
            head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Сотрудник удален.");
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        System.out.println("Список сотрудников (от начала к концу):");
        EmployeeNode current = head;
        int count = 1;
        while (current != null) {
            System.out.print(count + ". ");
            current.print();
            current = current.next;
            count++;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        System.out.println("Список сотрудников (от конца к началу):");
        EmployeeNode current = tail;
        int count = 1;
        while (current != null) {
            System.out.print(count + ". ");
            current.print();
            current = current.prev;
            count++;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        System.out.println("Список очищен.");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
