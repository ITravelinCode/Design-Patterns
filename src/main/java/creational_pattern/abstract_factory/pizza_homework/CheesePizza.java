package creational_pattern.abstract_factory.pizza_homework;

public class CheesePizza extends Pizza {
    private final BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing add ingredients for cheese pizza...");
        toppingFactory.getCheese();
        toppingFactory.getSauce();
    }

}
