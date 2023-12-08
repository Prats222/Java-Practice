package constructors;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Prats", 21, 71.5);
        Human human2 = new Human("Vaish", 20, 58);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.pee();
    }
}
