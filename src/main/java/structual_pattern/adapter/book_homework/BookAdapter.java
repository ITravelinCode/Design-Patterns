package structual_pattern.adapter.book_homework;

public class BookAdapter implements IBook{
    private final NovelBook novelBook;

    public BookAdapter(NovelBook novelBook) {
        this.novelBook = novelBook;
    }

    @Override
    public void content(String content) {
        novelBook.content(content);
    }
}
