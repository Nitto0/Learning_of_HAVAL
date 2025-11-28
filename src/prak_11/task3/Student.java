package prak_11.task3;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    String name;
    Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getBirthDate(String format) {
        SimpleDateFormat formatter;

        if (format.equals("short")) {
            formatter = new SimpleDateFormat("dd.MM.yy");
        } else if (format.equals("medium")) {
            formatter = new SimpleDateFormat("dd MMM yyyy");
        } else {
            formatter = new SimpleDateFormat("EEEE, d MMMM yyyy");
        }

        return formatter.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + getBirthDate("medium") +
                '}';
    }
}
