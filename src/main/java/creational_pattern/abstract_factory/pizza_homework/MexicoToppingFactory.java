package creational_pattern.abstract_factory.pizza_homework;

public class MexicoToppingFactory implements BaseToppingFactory{
    @Override
    public Cheese getCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce getSauce() {
        return new ChilliSauce();
    }
}
