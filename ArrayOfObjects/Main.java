package ArrayOfObjects;

public class Main {
    public static void main(String[] args) {
        // make array of objects method 1
        // Foood[] fridge = new Foood[3];

        Foood food1 = new Foood("Tacos");
        Foood food2 = new Foood("Pizza");
        Foood food3 = new Foood("Paneer");

        // array of objects method 2
        Foood[] fridge = { food1, food2, food3 };

        // array of obj 1
        // fridge[0] = food1;
        // fridge[1] = food2;
        // fridge[2] = food3;

        System.out.println(fridge[2].name);
    }

}
