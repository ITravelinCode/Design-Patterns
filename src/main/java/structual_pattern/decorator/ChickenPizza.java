package structual_pattern.decorator;

public class ChickenPizza implements IPizza{
    @Override
    public String doPizza() {
        return "Doing chicken pizza";
    }
}
