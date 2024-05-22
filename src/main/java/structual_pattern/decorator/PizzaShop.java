package structual_pattern.decorator;

public class PizzaShop {
    public static void main(String[] args) {
        IPizza tomatoPizza = new TomatoPizza();
        IPizza chickenPizza = new ChickenPizza();

        System.out.println(tomatoPizza.doPizza());
        System.out.println(chickenPizza.doPizza());

        PizzaDecorator pepperTomatoPizza = new PepperDecorator(tomatoPizza);
        PizzaDecorator cheeseChickenPizza = new CheeseDecorator(chickenPizza);
        PizzaDecorator cheeseTomatoPizza = new CheeseDecorator(tomatoPizza);
        PizzaDecorator pepperChickenPizza = new PepperDecorator(chickenPizza);

        System.out.println(pepperTomatoPizza.doPizza());
        System.out.println(cheeseChickenPizza.doPizza());
        System.out.println(cheeseTomatoPizza.doPizza());
        System.out.println(pepperChickenPizza.doPizza());
    }
}
