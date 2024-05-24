package behaviroal_pattern.student_homework;
/**
 * Concrete Iterator: là lớp triển khai Iterator*/
public class ConcreteIterator<T> implements Iterator<T>{
    private final T[] objects;
    private int position;

    public ConcreteIterator(T[] objects) {
        this.objects = objects;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < objects.length;
    }

    @Override
    public T next() {
        return objects[position++];
    }
}
