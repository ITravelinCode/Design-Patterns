package behaviroal_pattern.mediator.ui_homework;

public interface UIControlMediator {
    void registerControl(String name, UIControl control);
    void notify(String event, UIControl control);
}
