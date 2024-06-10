package Stringsui;

import java.util.*;

public class StringBuiFunc {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Physics");

        // reverse
        str.reverse();
        System.out.println(str);

        // delete(i,j) - its is diff from deletCharAt (it deletes at certain char).
        str.reverse();
        str.delete(2, 4); // same as substring n-1
        System.out.println(str);

        // nrml string func are also available in strings.(not all like eg- concar ,
        // append is there so no need of concat)
    }
}
