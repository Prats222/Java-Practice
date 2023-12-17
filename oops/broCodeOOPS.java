package oops;

public class broCodeOOPS {
    public static void main(String[] args) {
        car myCar = new car();
        System.out.println(myCar.Model);
        System.out.println(myCar.make);
        System.out.println();
        myCar.drive();
        myCar.brake();
    }
}
