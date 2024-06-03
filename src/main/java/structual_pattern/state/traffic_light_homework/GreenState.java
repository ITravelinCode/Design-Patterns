package structual_pattern.state.traffic_light_homework;

public class GreenState extends State {
    public GreenState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public void change() {
        trafficLight.changeState(new YellowState(this.trafficLight));
        trafficLight.isGreen = false;
    }

    @Override
    public void reportState() {
        System.out.println("Green light");
    }
}
