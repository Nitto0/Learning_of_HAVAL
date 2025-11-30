package prak_13.task_4;

public class Shirt {
    String id;
    String name;
    String color;
    String size;

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nColor: " + color + "\nSize: " + size + "\n";
    }
}
