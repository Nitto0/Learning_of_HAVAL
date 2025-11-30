package prak_13.task_3;

public class AddressTest {
    public static void main(String[] args) {
        Address addr1 = new Address();
        addr1.parseStringSplit("Россия, Москва, Москва, Тверская, 10, 2, 15", ",");
        System.out.println(addr1);

        Address addr2 = new Address();
        addr2.parseStringTokenizer("USA; California; Los Angeles; Hollywood Blvd; 123; ; 45", ";");
        System.out.println(addr2);
    }
}
