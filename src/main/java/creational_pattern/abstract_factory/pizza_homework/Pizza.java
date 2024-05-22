package creational_pattern.abstract_factory.pizza_homework;

public abstract class Pizza {
    public abstract void addIngredients();
    public void bakingPizza() {
        System.out.println("Baking pizza in 40 minutes...");
    }
}
