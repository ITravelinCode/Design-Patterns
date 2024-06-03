package structual_pattern.state.traffic_light_homework;

public class YellowState extends State {
    public YellowState(TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public void change() {
        if(trafficLight.isGreen) {
            trafficLight.changeState(new GreenState(this.trafficLight));
        }
        else {
            trafficLight.changeState(new RedState(this.trafficLight));
        }
    }

    @Override
    public void reportState() {
        System.out.println("Yellow light");
    }
}
