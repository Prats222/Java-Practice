package Stringsui;

import java.util.*;

public class interning {
    public static void main(String[] args) {
        String str = "hello";
        String gtr = "hello";
        // here both string have same value as hello , in memory new variable gtr is not
        // formed as its same, only str exists. This is called interning.

        // but to make an extra copy of the keyword and its own memory, we have to use
        // "new" keyword.

        String x = new String("hello");

        // character chnaging in a string process. We cant directly write str.charAt(0)
        // = 's' . wrong.

        // correct way(low performance ) -
        x = x.substring(0, 2) + 'y' + x.substring(3);
        System.out.println(x); // heylo

        // this is not directly changing character, it is making a new string in memory.

    }

}
