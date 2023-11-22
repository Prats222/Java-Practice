import java.util.*;

public class revStrimg {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.length());
        StringBuilder newSb = new StringBuilder(" ");
        int j = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            newSb.insert(j, sb.charAt(i));
            j++;
        }
        System.out.print(newSb);
    }
}
