package Polymorph;

public class Main {
    public static void main(String[] args) {
        // Ability of an object to identify as more than one type.
        // ability on obj to be more than 1 type by storing in in 1 super class and then
        // using the super class as an array.

        Car gari = new Car();
        Bicycle cycle = new Bicycle();
        Boat nau = new Boat();

        Vechile[] racers = { gari, cycle, nau };

        for (Vechile i : racers) {
            i.go();
        }

    }
}
