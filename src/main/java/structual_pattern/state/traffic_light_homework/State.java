package structual_pattern.state.traffic_light_homework;

public abstract class State {
    protected TrafficLight trafficLight;

    public State(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }
    public abstract void change();
    public abstract void reportState();
}
