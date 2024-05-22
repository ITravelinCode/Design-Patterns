package creational_pattern.builder.employee_homework;

public class Employee {
    private String id;
    private String fullName;
    private String argument;
    private String phone;
    private String dateOfBirth;

    public Employee(String id, String fullName, String argument, String phone, String dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.argument = argument;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getArgument() {
        return argument;
    }

    public String getPhone() {
        return phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

}
