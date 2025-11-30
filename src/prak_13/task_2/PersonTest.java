package prak_13.task_2;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFullName());

        Person person2 = new Person("Петров", "Пётр", null);
        System.out.println(person2.getFullName());

        Person person3 = new Person("Сидоров", null, "");
        System.out.println(person3.getFullName());

        Person person4 = new Person("Кузнецов", "", "Васильевич");
        System.out.println(person4.getFullName());
    }
}
