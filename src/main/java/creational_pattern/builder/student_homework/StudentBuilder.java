package creational_pattern.builder.student_homework;

public class StudentBuilder implements IBuilder{
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String currentClass;
    private String phone;
    @Override
    public IBuilder setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public IBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public IBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public IBuilder setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    @Override
    public IBuilder setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
        return this;
    }

    @Override
    public IBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Student build() {
        return new Student(id, firstName, lastName, dateOfBirth, currentClass, phone);
    }
}
