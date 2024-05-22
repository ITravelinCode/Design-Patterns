package creational_pattern.builder.employee_homework;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeConcreteBuilder();
        Employee employee = employeeBuilder.setId("e1").setFullName("Nguyen Van A").build();
        System.out.println(employee.getId());
    }
}
