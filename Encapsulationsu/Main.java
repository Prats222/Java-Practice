package Encapsulationsu;

public class Main {
    public static void main(String[] args) {
        // attributes of a class will be private, can be only accessed only through
        // methods(getters,setters), you should make attributes private if you dont have
        // a reason to make them public.
        Car garr = new Car("Maruti", "dzire", 2015);
        System.out.println(garr.getModel());

        garr.setYear(2020);
        System.out.println(garr.getYear());
    }
}
