package creational_pattern.prototype;

public class Rectangle extends Shape{
    public Rectangle(String style) {
        super(style);
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.getStyle());
    }
}
