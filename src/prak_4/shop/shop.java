package prak_4.shop;

import java.util.Scanner;

public class shop {
    public static void main(String[] argc) {
        String login = "user1234";
        String password = "1234";

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Введите логин: ");
            String log = sc.nextLine();

            System.out.print("Введите пароль: ");
            String pass = sc.nextLine();

            if (login.equals(log) && password.equals(pass)) {
                System.out.println("Вы успешно авторизованы");
                break;
            }
        }

        products[] prod = new products[100];
        int count = 0;
        int all_price = 0;
        while(true) {
            System.out.println("------------------------------");
            System.out.println("Выберети пункт:");
            System.out.println("1. Список каталогов");
            System.out.println("2. Корзина");
            System.out.println("3. Выйти");

            int choice = sc.nextInt();
            if(choice == 3) {
                break;
            } else if (choice == 1) {
                System.out.println("----------------------------");
                System.out.println("1. " + categories.SWEETS.getName());
                System.out.println("2. " + categories.CLOTHES.getName());
                System.out.println("3. " + categories.DRINKS.getName());
                System.out.println("4. Назад");
                System.out.print("Выберете пункт: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("1. " + products.CHOC.getName() + ", price: " + products.CHOC.getCost());
                        System.out.println("2. " + products.CANDY.getName() + ", price: " + products.CANDY.getCost());
                        System.out.println("3. Назад");

                        System.out.print("Выберете, что положить в корзину (или выйти): ");
                        int choice2 = sc.nextInt();
                        switch(choice2) {
                            case 1:
                                prod[count] = products.CHOC;
                                count++;
                                all_price += products.CHOC.getCost();
                                break;
                            case 2:
                                prod[count] = products.CANDY;
                                all_price += products.CANDY.getCost();
                                count++;
                            case 3:
                                continue;
                        }
                        break;
                    case 2:
                        System.out.println("1. " + products.SHIRT.getName() + ", price: " + products.SHIRT.getCost());
                        System.out.println("2. " + products.HAT.getName() + ", price: " + products.HAT.getCost());
                        System.out.println("3. Назад");

                        System.out.print("Выберете, что положить в корзину (или выйти): ");
                        int choice3 = sc.nextInt();
                        switch(choice3) {
                            case 1:
                                prod[count] = products.SHIRT;
                                all_price += products.SHIRT.getCost();
                                count++;
                                break;
                            case 2:
                                prod[count] = products.HAT;
                                all_price += products.HAT.getCost();
                                count++;
                            case 3:
                                continue;
                        }
                        break;
                    case 3:
                        System.out.println("1. " + products.COLA.getName() + ", price: " + products.COLA.getCost());
                        System.out.println("2. " + products.COFFEE.getName() + ", price: " + products.COFFEE.getCost());
                        System.out.println("3. Назад");

                        System.out.print("Выберете, что положить в корзину (или выйти): ");
                        int choice4 = sc.nextInt();
                        switch(choice4) {
                            case 1:
                                prod[count] = products.COLA;
                                all_price += products.COLA.getCost();
                                count++;
                                break;
                            case 2:
                                prod[count] = products.COFFEE;
                                all_price += products.COFFEE.getCost();
                                count++;
                                break;
                            case 3:
                                continue;
                        }
                        break;
                }
            } else if (choice == 2) {
                System.out.println("-------------------------");
                System.out.println("Корзина:");
                for(int i = 0; i < count; i++) {
                    System.out.println("1. " + prod[i].getName() + ". Price: " + prod[i].getCost());
                }
                System.out.println("Общая стоимость товаров в корзине: " + all_price);
                System.out.print("Купить товары?(y/n) ");
                String ch = sc.next();

                if (ch.equals("y")) {
                    System.out.println("Вы купили все товары!");
                    count = 0;
                    all_price = 0;
                }
            }
        }
    }
}
