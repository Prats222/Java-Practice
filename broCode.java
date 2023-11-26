import java.util.*;

public class broCode {
    public static void main(String[] args) {
        // overLoaded method java
        int x = add(1, 2, 3);
        System.out.println(x);

        // printf method %d,%c,%f,%s
        System.out.printf("this is %d format", 22);

    }

    // overloaded method
    static int add(int a, int b) {
        System.out.println("#1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("#2");
        return a + b + c;
    }
    // -------------------------
}
