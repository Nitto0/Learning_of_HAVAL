package prak_17.task_3;

import java.util.Scanner;

public class ProductNode {
    String name;
    double price;
    int quantity;
    ProductNode next;

    public void readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        this.name = scanner.nextLine();
        System.out.print("Введите цену товара: ");
        this.price = scanner.nextDouble();
        System.out.print("Введите количество: ");
        this.quantity = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
    }

    public void print() {
        System.out.println("Товар: " + name + ", Цена: " + price + ", Количество: " + quantity);
    }
}
