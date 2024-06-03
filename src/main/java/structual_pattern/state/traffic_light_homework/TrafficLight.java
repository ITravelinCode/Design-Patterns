package structual_pattern.state.traffic_light_homework;

public class TrafficLight {
    private State state;
    public boolean isGreen;

    public TrafficLight() {
        this.state = new RedState(this);
        this.isGreen = false;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void change(){
        state.change();
    }

    public void reportChange() {
        state.reportState();
    }
}
