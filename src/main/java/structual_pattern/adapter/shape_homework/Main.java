package structual_pattern.adapter.shape_homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>() ;
        int x = 10, y = 20, w =30, h = 40;
        rectangles.add(new RectangleAdapter(new LegacyRectangle()));
        rectangles.add(new LineAdapter(new LegacyLine()));
        rectangles.forEach(rectangle -> rectangle.draw(x,y,w,h));
    }
}
