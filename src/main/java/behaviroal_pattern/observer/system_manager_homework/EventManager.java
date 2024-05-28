package behaviroal_pattern.observer.system_manager_homework;

import java.util.HashMap;

/**
 * Subject: Lớp giữ danh sách các đội tượng quan sát (observers),
 * cung cấp các phương thức như thêm, xóa, thông báo.*/
public class EventManager {
    private final HashMap<EventListener, String> eventListeners;
    public EventManager() {
        eventListeners = new HashMap<>();
    }
    private String data, eventType;

    public void subscribe(String eventType, EventListener listener) {
        eventListeners.put(listener, eventType);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        eventListeners.remove(listener, eventType);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notify(eventType, data);
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void notify(String eventType, String data) {
        for(var listener : eventListeners.keySet()) {
            listener.update();
        }
    }
}
