package creational_pattern.builder.employee_homework;

public class EmployeeConcreteBuilder implements EmployeeBuilder{
    private String id;
    private String fullName;
    private String argument;
    private String phone;
    private String dateOfBirth;
    public EmployeeBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public EmployeeBuilder setArgument(String argument) {
        this.argument = argument;
        return this;
    }

    public EmployeeBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public EmployeeBuilder setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public Employee build() {
        return new Employee(id, fullName, argument, phone, dateOfBirth);
    }
}
