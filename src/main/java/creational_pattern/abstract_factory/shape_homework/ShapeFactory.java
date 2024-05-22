package creational_pattern.abstract_factory.shape_homework;

public class ShapeFactory {
    public Shape getShape(String type) {
        if(type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if(type.equalsIgnoreCase("square")) {
            return new Square();
        } else if(type.equalsIgnoreCase("circle")) {
            return  new Circle();
        } else {
            return null;
        }
    }
}
