package structual_pattern.decorator;
/**
 * ConcreteDecorator: Một class thực hiện các cài đặt của Decorator
 * đồng thời thêm các hàm, tính chất (functionality) vào trong đó.*/
public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String type = this.getPizza().doPizza();
        return type + addCheese();
    }

    private String addCheese() {
        return " Add cheese";
    }
}
