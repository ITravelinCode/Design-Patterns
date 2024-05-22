package structual_pattern.decorator;
/**
 * ConcreteComponent: Một class implements cho interface Component mà nó định nghĩa
 * một đối tượng cần thêm chức năng trong quá trình chạy*/
public class TomatoPizza implements IPizza{

    @Override
    public String doPizza() {
        return "Doing tomato pizza";
    }
}
