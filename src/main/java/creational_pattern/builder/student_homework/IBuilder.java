package creational_pattern.builder.student_homework;

public interface IBuilder {
    IBuilder setId(String id);
    IBuilder setFirstName(String firstName);
    IBuilder setLastName(String lastName);
    IBuilder setDateOfBirth(String dateOfBirth);
    IBuilder setCurrentClass(String currentClass);
    IBuilder setPhone(String phone);
    Student build();
}
