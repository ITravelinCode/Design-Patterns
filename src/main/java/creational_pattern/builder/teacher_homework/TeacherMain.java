package creational_pattern.builder.teacher_homework;


public class TeacherMain {
    public static void main(String[] args) {
        TeacherBuilder builder = new TeacherConcreteBuilder();
        Teacher teacher = builder.setId("id").setFirstName("Test").build();
        System.out.println(teacher.getId());
    }
}
