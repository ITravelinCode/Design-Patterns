package creational_pattern.builder.teacher_homework;

public class Teacher {
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phone;

    public Teacher(String id, String firstName, String lastName, String dateOfBirth, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }
}
