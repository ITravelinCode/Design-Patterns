package behaviroal_pattern.mediator.ui_homework;

import java.util.HashMap;

public class ConcreteUIControlMediator implements UIControlMediator{
    private HashMap<String, UIControl> controls = new HashMap<>();
    @Override
    public void registerControl(String name, UIControl control) {
        controls.put(name, control);
    }

    @Override
    public void notify(String event, UIControl sender) {
        if (event.equals("buttonClicked")) {
            controls.get("textBox").setText("Button was clicked");
        } else if (event.equals("textChanged")) {
            controls.get("label").setText("Text changed to: " + ((TextBox) sender).getText());
        }
    }
}
