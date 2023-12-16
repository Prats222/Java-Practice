package interfaceu;

public class Main {
    public static void main(String[] args) {
        // interface= template for a class, similar to inheritance, but specifies what
        // must a class do. Classes can apply more than one interface, inheritance is
        // limited to 1 superclass.

        Rabbit khargos = new Rabbit();
        khargos.flee();

        Hawk chel = new Hawk();
        chel.attack();
        chel.flee();

        Fish machli = new Fish();
        machli.attack();
        machli.flee();
    }
}
