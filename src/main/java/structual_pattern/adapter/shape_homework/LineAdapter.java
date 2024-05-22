package structual_pattern.adapter.shape_homework;
/**
 * Adapter: Lớp chuyển đổi interface của Adaptee thành interface của Target interface*/
public class LineAdapter implements Rectangle{
    private final LegacyLine legacyLine;

    public LineAdapter(LegacyLine legacyLine) {
        this.legacyLine = legacyLine;
    }

    @Override
    public void draw(int x, int y, int w, int h) {
        legacyLine.draw(x, y, w, h);
    }
}
