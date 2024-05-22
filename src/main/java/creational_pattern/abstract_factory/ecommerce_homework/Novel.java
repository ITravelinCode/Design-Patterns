package creational_pattern.abstract_factory.ecommerce_homework;

public class Novel implements IBook{
    @Override
    public void getDescription() {
        System.out.println("This is novel");
    }
}
