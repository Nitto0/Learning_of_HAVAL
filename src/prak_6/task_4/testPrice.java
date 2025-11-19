package prak_6.task_4;

public class testPrice {
    public static void main(String[] argc) {
        Car car = new Car(500000);
        Phone phone = new Phone(100000);
        House house = new House(15000000);

        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());
        System.out.println(house.getPrice());
    }
}
