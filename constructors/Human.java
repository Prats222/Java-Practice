package constructors;

public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + "is doing dhakad");
    }

    void pee() {
        System.out.println(this.name + " is doingsssssssssss");
    }
}
