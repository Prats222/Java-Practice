package ObjectPassing;

public class car {
    String make = "Maruti";
    String Model = "Dzire vx";
    int year = 2015;
    String color = "brown";
    double price = 900000;

    void drive() {
        System.out.println("bhrum bhrum");
    }

    void brake() {
        System.out.println("Stop neegaaaaa");
    }

    public String toString() {
        // String mine = make + "\n" + Model + "\n" + year + "\n" + color;
        // return mine;

        return make + "\n" + Model + "\n" + year + "\n" + color;
    }
}
