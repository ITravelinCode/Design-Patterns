package creational_pattern.abstract_factory.pizza_homework;

public class ClassicToppingFactory implements BaseToppingFactory{
    @Override
    public Cheese getCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce getSauce() {
        return new TomatoSauce();
    }
}
