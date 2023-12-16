package interfaceu;

public class Fish implements Predator, Prey {
    public void attack() {
        System.out.println("grr");

    }

    public void flee() {
        System.out.println("drrrrr");
    }

}
