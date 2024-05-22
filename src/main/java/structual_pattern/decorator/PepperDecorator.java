package structual_pattern.decorator;
/**
 * ConcreteDecorator: Một class thực hiện các cài đặt của Decorator
 * đồng thời thêm các hàm, tính chất (functionality) vào trong đó.*/
public class PepperDecorator extends PizzaDecorator {
    public PepperDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String type = this.getPizza().doPizza();
        return type + addPepper();
    }

    private String addPepper() {
        return " Add pepper";
    }
}
