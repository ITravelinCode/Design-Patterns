package behaviroal_pattern.observer.system_manager_homework;

public class EventMain {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        EventListener debug = new DebuggingListener(eventManager);
        EventListener log = new LoggingListener(eventManager);

        eventManager.subscribe("debugger", debug);
        eventManager.subscribe("logger", log);

        eventManager.setData("Error in File Reader");
        eventManager.setData("Server is a nuclear bom");
    }
}
