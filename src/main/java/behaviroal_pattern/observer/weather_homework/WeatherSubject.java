package behaviroal_pattern.observer.weather_homework;
import java.util.ArrayList;
import java.util.List;

/**
 * Subject: Lớp giữ danh sách các đội tượng quan sát (observers),
 * cung cấp các phương thức như thêm, xóa, thông báo.*/
public class WeatherSubject {
    private final List<Observer> observerList;
    private int temperature;

    public WeatherSubject() {
        this.observerList = new ArrayList<>();
    }
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(Observer observer : observerList) {
            observer.update();
        }
    }
}
