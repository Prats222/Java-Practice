package Encapsulationsu;

public class Main {
    public static void main(String[] args) {
        // attributes of a class will be private, can be only accessed only through
        // methods(getters,setters), you should make attributes private if you dont have
        // a reason to make them public.

        Car garr1 = new Car("Maruti", "dzire", 2015);

        // Car garr2 = new Car("hundi", "city", 2022);

        // copy method
        // garr2.copy(garr1);
        Car garr2 = new Car(garr1);
        System.out.println(garr1);
        System.out.println(garr2);

        System.out.println(garr1.getModel());

        garr1.setYear(2020);
        System.out.println(garr1.getYear());
        System.out.println(garr2.getModel());

    }
}
