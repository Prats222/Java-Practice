import java.util.*;

public class WaterJugProblem {

    // Maximum capacities of 3 jugs -> x, y, z
    static int x = 12;
    static int y = 8;
    static int z = 5;

    // To mark visited states
    static Set<String> memory = new HashSet<>();
    // To store solution path
    static List<int[]> ans = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Starting work...\n");
        int[] initialState = { 12, 0, 0 };
        getAllStates(initialState);
        Collections.reverse(ans);
        for (int[] state : ans) {
            System.out.println(Arrays.toString(state));
        }
    }

    public static boolean getAllStates(int[] state) {
        // Let the 3 jugs be called a, b, c
        int a = state[0];
        int b = state[1];
        int c = state[2];

        if (a == 6 && b == 6) {
            ans.add(state.clone());
            return true;
        }

        // If current state is already visited earlier
        String key = a + "," + b + "," + c;
        if (memory.contains(key)) {
            return false;
        }
        memory.add(key);

        // Empty jug a
        if (a > 0) {
            // Empty a into b
            if (a + b <= y) {
                if (getAllStates(new int[] { 0, a + b, c })) {
                    ans.add(state.clone());
                    return true;
                }
            } else {
                if (getAllStates(new int[] { a - (y - b), y, c })) {
                    ans.add(state.clone());
                    return true;
                }
            }

            // Empty a into c
            if (a + c <= z) {
                if (getAllStates(new int[] { 0, b, a + c })) {
                    ans.add(state.clone());
                    return true;
                }
            } else {
                if (getAllStates(new int[] { a - (z - c), b, z })) {
                    ans.add(state.clone());
                    return true;
                }
            }
        }

        // Empty jug b
        if (b > 0) {
            // Empty b into a
            if (a + b <= x) {
                if (getAllStates(new int[] { a + b, 0, c })) {
                    ans.add(state.clone());
                    return true;
                }
            } else {
                if (getAllStates(new int[] { x, b - (x - a), c })) {
                    ans.add(state.clone());
                    return true;
                }
            }

            // Empty b into c
            if (b + c <= z) {
                if (getAllStates(new int[] { a, 0, b + c })) {
                    ans.add(state.clone());
                    return true;
                }
            } else {
                if (getAllStates(new int[] { a, b - (z - c), z })) {
                    ans.add(state.clone());
                    return true;
                }
            }
        }

        // Empty jug c
        if (c > 0) {
            // Empty c into a
            if (a + c <= x) {
                if (getAllStates(new int[] { a + c, b, 0 })) {
                    ans.add(state.clone());
                    return true;
                }
            } else {
                if (getAllStates(new int[] { x, b, c - (x - a) })) {
                    ans.add(state.clone());
                    return true;
                }
            }

            // Empty c into b
            if (b + c <= y) {
                if (getAllStates(new int[] { a, b + c, 0 })) {
                    ans.add(state.clone());
                    return true;
                }
            } else {
                if (getAllStates(new int[] { a, y, c - (y - b) })) {
                    ans.add(state.clone());
                    return true;
                }
            }
        }

        return false;
    }
}
