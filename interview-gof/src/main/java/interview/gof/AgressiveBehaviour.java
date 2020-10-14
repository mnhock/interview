package interview.gof;

public class AgressiveBehaviour implements Behaviour {

    @Override
    public void move() {
        System.out.println("\tAgressive Behaviour: if find another robot attack it");
    }
}
