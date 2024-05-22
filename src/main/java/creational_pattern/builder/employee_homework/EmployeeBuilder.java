package creational_pattern.builder.employee_homework;

public interface EmployeeBuilder {
    EmployeeBuilder setId(String id);
    EmployeeBuilder setFullName(String fullName);
    EmployeeBuilder setArgument(String argument);
    EmployeeBuilder setPhone(String phone);
    EmployeeBuilder setDateOfBirth(String dateOfBirth);
    Employee build();
}
