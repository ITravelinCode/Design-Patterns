package creational_pattern.builder.student_homework;

import java.util.Date;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String currentClass;
    private String phone;

    public Student(String id, String firstName, String lastName, String dateOfBirth, String currentClass, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.currentClass = currentClass;
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

    public String getCurrentClass() {
        return currentClass;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
