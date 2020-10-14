package interview.gof;

public class NormalBehaviour implements Behaviour {
    @Override
    public void move() {
        System.out.println("\tNormal Behaviour: if find another robot ignore it");
    }
}
