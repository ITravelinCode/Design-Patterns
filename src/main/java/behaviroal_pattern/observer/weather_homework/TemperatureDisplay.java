package behaviroal_pattern.observer.weather_homework;
/**
 * Concrete Observer: Lớp cụ thể triển khai Observer, cập nhật trạng thái thay đổi của nó để phản hồi đến Subject.*/
public class TemperatureDisplay implements Observer{
    private final WeatherSubject weatherSubject;

    public TemperatureDisplay(WeatherSubject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Temperature updated: " + weatherSubject.getTemperature());
    }
}
