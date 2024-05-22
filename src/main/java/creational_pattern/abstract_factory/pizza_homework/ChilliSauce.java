package creational_pattern.abstract_factory.pizza_homework;

public class ChilliSauce implements Sauce{
    public ChilliSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing Chilli Sauce...");
    }
}
