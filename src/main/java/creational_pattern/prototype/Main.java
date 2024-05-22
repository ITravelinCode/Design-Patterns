package creational_pattern.prototype;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle");
        Shape clonedCircle = circle.clone();
        System.out.println(circle);
        System.out.println(clonedCircle);
    }
}
