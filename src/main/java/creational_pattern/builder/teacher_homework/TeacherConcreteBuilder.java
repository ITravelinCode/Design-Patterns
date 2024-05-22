package creational_pattern.builder.teacher_homework;

public class TeacherConcreteBuilder implements TeacherBuilder{
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phone;
    @Override
    public TeacherBuilder setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public TeacherBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public TeacherBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public TeacherBuilder setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    @Override
    public TeacherBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Teacher build() {
        return new Teacher(id, firstName, lastName, dateOfBirth, phone);
    }
}
