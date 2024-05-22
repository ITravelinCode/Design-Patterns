package creational_pattern.abstract_factory.ecommerce_homework;

public class PhuongNamFactory implements AbstractFactory{
    public PhuongNamFactory() {
    }

    @Override
    public IBook createBook() {
        return new Novel();
    }

    @Override
    public IElectronics createElectronics() {
        return new TV();
    }
}
