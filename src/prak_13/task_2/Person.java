package prak_13.task_2;

public class Person {
    String lastName;
    String firstName;
    String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName);
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(middleName.charAt(0)).append(".");
        }

        return sb.toString();
    }
}
