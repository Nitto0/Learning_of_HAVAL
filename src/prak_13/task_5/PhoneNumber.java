package prak_13.task_5;

public class PhoneNumber {
    public String number;

    public PhoneNumber(String number) {
        this.number = number;
    }
    public String formatPhoneNumber() {
        if (number.startsWith("+")) {
            return "+" + number.substring(1, number.length() - 7) +
                    "-" + number.substring(number.length() - 7, number.length() - 4) +
                    "-" + number.substring(number.length() - 4);
        } else if (number.startsWith("8")) {
            return "+7" + number.substring(1, 4) + "-" + number.substring(4, 7) + "-" + number.substring(7, 11);
        }
        return number;
    }
}
