package behaviroal_pattern.iterator.student_homework;

public class Student {
    private String firstName;
    private String lastName;
    private String studentCode;

    public Student(String firstName, String lastName, String studentCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCode = studentCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
