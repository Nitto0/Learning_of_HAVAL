package prak_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        int count = 10000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            arrayList.add(i);
        }
        long arrayAdd = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            linkedList.add(i);
        }
        long linkedAdd = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        boolean found1 = arrayList.contains(count - 1);
        long arraySearch = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        boolean found2 = linkedList.contains(count - 1);
        long linkedSearch = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        arrayList.remove(0);
        long arrayRemove = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        linkedList.remove(0);
        long linkedRemove = System.currentTimeMillis() - start;

        System.out.println("Сравнение ArrayList и LinkedList:");
        System.out.println("Добавление " + count + " элементов:");
        System.out.println("ArrayList: " + arrayAdd + " мс");
        System.out.println("LinkedList: " + linkedAdd + " мс");

        System.out.println("\nПоиск элемента:");
        System.out.println("ArrayList: " + arraySearch + " мс");
        System.out.println("LinkedList: " + linkedSearch + " мс");
        System.out.println("Найдено: " + found1 + " / " + found2);

        System.out.println("\nУдаление первого элемента:");
        System.out.println("ArrayList: " + arrayRemove + " мс");
        System.out.println("LinkedList: " + linkedRemove + " мс");
    }
}
