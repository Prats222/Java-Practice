package inhertenocu;

public class Main {
    public static void main(String[] args) {
        // car class and bicyle class should inherit everything from vechile class.
        Car garr = new Car();
        garr.go();
        System.out.println(garr.speed);
        Bicycle bike = new Bicycle();
        System.out.println(bike.speed);
        bike.stop();

        System.out.println(garr.wheels);
        System.out.println(bike.wheels);

        System.out.println(garr.toString());
    }
}
