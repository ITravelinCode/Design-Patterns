package structual_pattern.state.traffic_light_homework;

public class RedState extends State {
    public RedState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public void change() {
        trafficLight.changeState(new YellowState(this.trafficLight));
        this.trafficLight.isGreen = true;
    }

    @Override
    public void reportState() {
        System.out.println("Red light");
    }
}
