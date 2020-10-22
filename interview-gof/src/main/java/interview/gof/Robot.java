package interview.gof;

public class Robot {
    private final Behaviour behaviour;

    public Robot(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void moveRobot() {
        System.out.println("The behaviour object decide the next move");

        this.behaviour.move();
    }
}