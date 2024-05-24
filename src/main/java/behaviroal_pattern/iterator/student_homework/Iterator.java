package behaviroal_pattern.student_homework;
/**
 * Iterator: Là một interface hoặc abstract class định nghĩa các phương thức cần thiết để
 * duyệt qua một collection như hasMore(), getNext()*/
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
