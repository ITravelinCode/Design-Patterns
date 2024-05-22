package creational_pattern.abstract_factory.pizza_homework;

public class PepperoniPizza extends Pizza {
    private final BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing add ingredients for pepperoni pizza");
        toppingFactory.getSauce();
        toppingFactory.getCheese();
    }
}
