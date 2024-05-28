package behaviroal_pattern.iterator.student_homework;
/**
 * Concrete Collection: Lớp implement Iterable Collection*/
public class ConcreteCollection implements IterableCollection{
    private final Student[] students;

    public ConcreteCollection(Student[] students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> createStudentIterator() {
        return new ConcreteIterator<Student>(students);
    }
}
