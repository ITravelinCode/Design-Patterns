package structual_pattern.adapter.book_homework;
/**
 * Adaptee: lớp muốn tương tác với interface không tương thích
 */
public class NovelBook {
    public void content(String content) {
        System.out.println("This is content: " + content);
    }
}
