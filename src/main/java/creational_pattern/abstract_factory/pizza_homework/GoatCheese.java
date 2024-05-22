package creational_pattern.abstract_factory.pizza_homework;

public class GoatCheese implements Cheese{
    public GoatCheese() {
        prepareCheese();
    }
    @Override
    public void prepareCheese() {
        System.out.println("Preparing Goat Cheese....");
    }
}
