package creational_pattern.abstract_factory.pizza_homework;

public class TomatoSauce implements Sauce{
    public TomatoSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing Tomato Sauce");
    }
}
