package prak_3;

public class Konverter {
    double ruble;

    public double getRuble() {
        return ruble;
    }

    public void setRuble(double ruble) {
        this.ruble = ruble;
    }

    public double rubleToDollar() {
        return ruble / 81.2;
    }
    public double rubleToEuro() {
        return ruble / 93.9;
    }
}
