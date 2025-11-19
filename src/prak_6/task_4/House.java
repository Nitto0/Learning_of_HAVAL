package prak_6.task_4;

public class House implements Priceable{
    int price;

    public House(int price) {
        this.price = price;
    }

    public String getPrice() {
        return "Дом стоит " + price + " рублей";
    }
}
