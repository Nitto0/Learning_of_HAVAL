package prak_6.task_3;

public class Animal implements Nameable{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return "Животное " + name;
    }
}
