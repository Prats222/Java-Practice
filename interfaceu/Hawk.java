package interfaceu;

public class Hawk implements Predator {
    @Override
    public void attack() {
        System.out.println("chiriya asman mei he peldiya");
    }

    public void flee() {
        System.out.println("bhurrr");
    }
}
