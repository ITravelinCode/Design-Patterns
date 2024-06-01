package behaviroal_pattern.mediator.ui_homework;

public abstract class UIControl {
    protected UIControlMediator mediator;

    public UIControl(UIControlMediator mediator) {
        this.mediator = mediator;
    }
    public abstract void setText(String text);
    public abstract String getText();
}
