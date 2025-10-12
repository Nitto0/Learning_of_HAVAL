package prak_3;

public class TestKonverter {
    public static void main(String[] argc) {
        Konverter kon = new Konverter();
        kon.setRuble(1000.0);

        System.out.printf("1000 рублей в долларах: %.2f\n", kon.rubleToDollar());
        System.out.printf("1000 рублей в евро: %.2f\n", kon.rubleToEuro());
    }
}
