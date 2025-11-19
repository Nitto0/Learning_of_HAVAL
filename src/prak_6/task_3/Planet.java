package prak_6.task_3;

public class Planet implements Nameable{
    String name;

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return "Планета " + name;
    }
}
