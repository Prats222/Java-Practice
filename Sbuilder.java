import java.util.*;

public class Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Prats");
        System.out.println(sb);

        // char at index 2

        System.out.println(sb.charAt(2));

        // set char at index 2

        sb.setCharAt(2, 'M');
        System.out.println(sb);

        // Insert new character

        sb.insert(0, 'D');
        System.out.println(sb);

        // Delete the inserted character

        sb.delete(0, 1);
        System.out.println(sb);

    }
}
