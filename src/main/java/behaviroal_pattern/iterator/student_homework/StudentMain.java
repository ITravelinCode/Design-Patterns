package behaviroal_pattern.iterator.student_homework;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Iron", "Man", "SE"),
            new Student("Captain", "Ame", "SS"),
            new Student("Super", "Man", "SA"),
        };

        IterableCollection iterableCollection = new ConcreteCollection(students);
        Iterator<Student> iterator = iterableCollection.createStudentIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getFirstName());
        }
    }
}
