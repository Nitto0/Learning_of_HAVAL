package prak_6.task_4;

public class Phone implements Priceable{
    int price;

    public Phone(int price) {
        this.price = price;
    }

    public String getPrice() {
        return "Телефон стоит " + price + " рублей";
    }
}
