package creational_pattern.builder.student_homework;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new StudentBuilder().setId("1").setFirstName("Haha").build();
    }
}
