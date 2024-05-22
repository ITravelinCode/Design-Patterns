package creational_pattern.abstract_factory.ecommerce_homework;

public class Main {
    public static void main(String[] args) {
        AbstractFactory phuongNam = new PhuongNamFactory();
        phuongNam.createBook().getDescription();
        phuongNam.createElectronics().getDescription();
    }
}
