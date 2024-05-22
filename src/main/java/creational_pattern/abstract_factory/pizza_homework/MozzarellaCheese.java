package creational_pattern.abstract_factory.pizza_homework;

public class MozzarellaCheese implements Cheese{
    public MozzarellaCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing Mozzarella Cheese...");
    }
}
