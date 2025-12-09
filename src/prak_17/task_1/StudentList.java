package prak_17.task_1;

import java.util.Scanner;

class StudentList {
    StudentNode head;

    public StudentList() {
        head = null;
    }

    public void add() {
        StudentNode newNode = new StudentNode();
        newNode.readFromConsole();

        if (head == null) {
            head = newNode;
        } else {
            StudentNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Студент добавлен в список.");
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Список пуст. Удалять нечего.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя студента для удаления: ");
        String nameToRemove = scanner.nextLine();

        if (head.name.equals(nameToRemove)) {
            head = head.next;
            System.out.println("Студент удален.");
            return;
        }

        StudentNode current = head;
        while (current.next != null && !current.next.name.equals(nameToRemove)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Студент удален.");
        } else {
            System.out.println("Студент с таким именем не найден.");
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        System.out.println("Список студентов:");
        StudentNode current = head;
        int count = 1;
        while (current != null) {
            System.out.print(count + ". ");
            current.print();
            current = current.next;
            count++;
        }
    }

    public void clear() {
        head = null;
        System.out.println("Список очищен.");
    }

    public boolean isEmpty() {
        return head == null;
    }
}