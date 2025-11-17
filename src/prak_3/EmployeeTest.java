package prak_3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов И.И.", 1234.567),
                new Employee("Петров П.П.", 9876.543),
                new Employee("Сидоров С.С.", 5432.109)
        };

        Report.generateReport(employees);
    }
}
