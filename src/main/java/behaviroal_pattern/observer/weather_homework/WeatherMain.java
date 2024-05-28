package behaviroal_pattern.observer.weather_homework;

public class WeatherMain {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        Observer observer1 = new TemperatureDisplay(weatherSubject);
        Observer observer2 = new TemperatureDisplay(weatherSubject);

        weatherSubject.setTemperature(25);
        weatherSubject.setTemperature(30);
    }
}
