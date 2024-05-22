package structual_pattern.adapter.book_homework;

public class Main {
    public static void main(String[] args) {
        IBook book = new BookAdapter(new NovelBook());
        book.content("novel");
    }
}
