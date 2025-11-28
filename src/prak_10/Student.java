package prak_10;

public class Student {
    String name;
    String lastName;
    String spec;
    int course;
    String group;
    double gpa;

    public Student(String name, String lastname, String spec, int course, String group, double gpa) {
        this.name = name;
        this.lastName = lastname;
        this.spec = spec;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getFirstName() { return name; }
    public String getLastName() { return lastName; }
    public String getSpecialty() { return spec; }
    public int getCourse() { return course; }
    public String getGroup() { return group; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", spec='" + spec + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
