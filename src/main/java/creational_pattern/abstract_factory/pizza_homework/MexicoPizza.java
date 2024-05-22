package creational_pattern.abstract_factory.pizza_homework;

public class MexicoPizza implements BasePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        BaseToppingFactory toppingFactory = new MexicoToppingFactory();
        pizza = switch (type) {
            case "cheese" -> new CheesePizza(toppingFactory);
            case "PepperoniPizza" -> new PepperoniPizza(toppingFactory);
            default -> pizza;
        };
        assert pizza != null;
        pizza.addIngredients();
        pizza.bakingPizza();
        return pizza;
    }
}
