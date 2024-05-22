package creational_pattern.prototype;

public class Circle extends Shape{
    public Circle(String style) {
        super(style);
    }

    @Override
    public Shape clone() {
        return new Circle(this.getStyle());
    }
}
