package creational_pattern.abstract_factory.pizza_homework;

public class PizzaMain {
    public static void main(String[] args) {
        BasePizzaFactory mexicoPizza = new MexicoPizza();
        mexicoPizza.createPizza("cheese");
    }
}
