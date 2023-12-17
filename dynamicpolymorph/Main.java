package dynamicpolymorph;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare an object , then use "New" method in diffrent ways to define that
        // object. like animal can be of diffrent choice in diffrent ways acc to need.

        Scanner sc = new Scanner(System.in);
        Animal ganvar;

        System.out.println("what animal you want?");
        System.out.print("(1=dog) or (2=cat)");
        int choice = sc.nextInt();

        if (choice == 1) {
            ganvar = new Dog();
            ganvar.speak();
        } else if (choice == 2) {
            ganvar = new Cat();
            ganvar.speak();
        } else {
            ganvar = new Animal();
            ganvar.speak();
        }
    }
}
