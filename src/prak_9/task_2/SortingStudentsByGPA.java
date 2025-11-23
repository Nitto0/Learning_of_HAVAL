package prak_9.task_2;

import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.gpa, s2.gpa);
    }
}
