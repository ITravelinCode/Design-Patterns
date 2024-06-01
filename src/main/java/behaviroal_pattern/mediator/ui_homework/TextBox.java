package behaviroal_pattern.mediator.ui_homework;

public class TextBox extends UIControl{
    private String text;

    public TextBox(UIControlMediator mediator) {
        super(mediator);
    }
    @Override
    public String getText() {
        return text;
    }
    @Override
    public void setText(String text) {
        this.text = text;
        mediator.notify("textChanged", this);
    }
}
