package structual_pattern.adapter.shape_homework;
/**
 * Adaptee: lớp hiện có với interface nhưng không tương thích*/
public class LegacyLine {
    public void draw(int x, int y, int w, int h) {
        System.out.printf("Drawing line with %d %d %d %d %n", x, y, w, h);
    }
}
