package PracticeString;

public class isomorphic {
    public static boolean isomo(String s, String t) {
        int map1[] = new int[256];
        int map2[] = new int[256];
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }
            // map1[s.charAt(i)] = i + 1;
            // map2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Prats";
        String t = "Prats";
        System.out.println(isomo(s, t));
    }
}
