package prak_6.task_4;

public class Car implements Priceable{
    int price;

    public Car(int price) {
        this.price = price;
    }

    public String getPrice() {
        return "Машина стоит " + price + " рублей";
    }
}
