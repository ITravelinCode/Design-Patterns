package structual_pattern.adapter.shape_homework;
/**
 * Adaptee: lớp hiện có với interface nhưng không tương thích*/
public class LegacyRectangle {
    public void draw(int x, int y, int w, int h) {
        System.out.println(String.format("Drawing rectangle with %d %d %d %d",x ,y, w, h));
    }
}
