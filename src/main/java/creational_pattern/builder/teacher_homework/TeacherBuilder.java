package creational_pattern.builder.teacher_homework;

public interface TeacherBuilder {
    TeacherBuilder setId(String id);
    TeacherBuilder setFirstName(String firstName);
    TeacherBuilder setLastName(String lastName);
    TeacherBuilder setDateOfBirth(String dateOfBirth);
    TeacherBuilder setPhone(String phone);
    Teacher build();
}
