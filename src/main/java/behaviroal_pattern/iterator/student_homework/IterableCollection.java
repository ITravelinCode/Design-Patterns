package behaviroal_pattern.student_homework;
/**
 * Iterable Collection: Là lớp interface hoặc abstrac class định nghĩa các phương thức
 * để tạo Iterator tương thích. */
public interface IterableCollection {
    Iterator<Student> createStudentIterator();
}
