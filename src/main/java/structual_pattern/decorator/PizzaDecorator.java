package structual_pattern.decorator;
/**
 * Decorator: Một lớp trừu tượng giữ một tham chiếu đến đối tượng Component
 * và đồng thời cài đặt các thành phần của giao diện Component đó.
 */

public abstract class PizzaDecorator implements IPizza {
    private final IPizza pizza;

    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String doPizza() {
        return pizza.doPizza();
    }

    public IPizza getPizza() {
        return pizza;
    }
}
