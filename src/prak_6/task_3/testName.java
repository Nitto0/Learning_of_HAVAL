package prak_6.task_3;

public class testName {
    public static void main(String[] argc) {
        Planet pl = new Planet("Замеля");
        Car car = new Car("Toyota");
        Animal animal = new Animal("кот");

        System.out.println(pl.getName());
        System.out.println(car.getName());
        System.out.println(animal.getName());
    }
}
