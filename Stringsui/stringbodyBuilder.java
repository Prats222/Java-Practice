package Stringsui;

import java.util.*;

public class stringbodyBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append(" world"); // any data type can be appended
        System.out.println(str);

        // setCharAt - we can change indiviudal ch, in nrml strings due to interning its
        // not possible.

        str.setCharAt(0, 'm');
        System.out.println(str);

        // insert and deleteCharAt - in nrml string we have to use substring method to
        // insert.

        str.insert(0, 'p');
        str.deleteCharAt(1);
        System.out.println(str);
    }
}
