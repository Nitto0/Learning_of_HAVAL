package prak_11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class task1 {
    public static void main(String[] args) {
        String developer = "Иванов";
        Date receiveDate = new Date();
        Date submitDate = new Date(System.currentTimeMillis() + 2 * 60 * 60 * 1000);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy 'at' HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Дата и время получения задания: " + dateFormatter.format(receiveDate));
        System.out.println("Дата и время сдачи задания: " + dateFormatter.format(submitDate));

        System.out.println("\nАльтернативный вариант:");
        System.out.println("Время получения (мс): " + System.currentTimeMillis());
    }
}