package prak_13.task_5;

public class testPhone {
    public static void main(String[] argc) {
        PhoneNumber phone1 = new PhoneNumber("+79175655655");
        PhoneNumber phone2 = new PhoneNumber("89175655655");

        System.out.println(phone1.formatPhoneNumber());
        System.out.println(phone2.formatPhoneNumber());
    }
}
