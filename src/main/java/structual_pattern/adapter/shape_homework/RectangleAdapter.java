package structual_pattern.adapter.shape_homework;
/**
 * Adapter: Lớp chuyển đổi interface của Adaptee thành interface của Target interface*/
public class RectangleAdapter implements Rectangle{
    private final LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw(int x, int y, int w, int h) {
        legacyRectangle.draw(x, y, w, h);
    }
}
