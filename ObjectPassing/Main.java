package ObjectPassing;

public class Main {
    public static void main(String[] args) {
        garagae gg = new garagae();
        car Car = new car();

        gg.park(Car);
        gg.drive(Car);
        System.out.println(Car.toString());
    }

}
