package prak_6.task_3;

public class Car implements Nameable{
    String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return "Машина " + name;
    }
}
