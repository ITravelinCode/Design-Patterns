package creational_pattern.prototype;
/**
 * Shape implements Cloneable
 * */
public abstract class Shape implements Cloneable{
    private String style;

    public Shape(String style) {
        this.style = style;
    }

    public abstract Shape clone();

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
