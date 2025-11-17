package prak_3;
import java.util.Formatter;

public class Report {
    public static void generateReport(Employee[] employees) {
        Formatter fmt = new Formatter();

        fmt.format("%-20s %15s%n", "ФИО сотрудника", "Зарплата");
        fmt.format("%-20s %15s%n", "----------------", "-------------");

        for (Employee emp : employees) {
            fmt.format("%-20s %15.2f%n", emp.fullname, emp.salary);
        }

        System.out.println(fmt);
        fmt.close();
    }
}
