package prak_3;

public class TestKonverter {
    public static void main(String[] argc) {
        Konverter kon = new Konverter();
        kon.setRuble(1000.0);

        System.out.println("1000 рублей в долларах: " + kon.rubleToDollar());
        System.out.println("1000 рублей в евро: " + kon.rubleToEuro());
    }
}
