import java.util.*;

class State {
    int cannibalLeft, missionaryLeft, cannibalRight, missionaryRight;
    String boat;
    State parent;

    // Constructor
    public State(int cannibalLeft, int missionaryLeft, String boat, int cannibalRight, int missionaryRight) {
        this.cannibalLeft = cannibalLeft;
        this.missionaryLeft = missionaryLeft;
        this.boat = boat;
        this.cannibalRight = cannibalRight;
        this.missionaryRight = missionaryRight;
        this.parent = null;
    }

    // Check if the current state is the goal state
    public boolean isGoal() {
        return this.cannibalLeft == 0 && this.missionaryLeft == 0;
    }

    // Check if the current state is valid
    public boolean isValid() {
        if (this.missionaryLeft >= 0 && this.missionaryRight >= 0 &&
                this.cannibalLeft >= 0 && this.cannibalRight >= 0 &&
                (this.missionaryLeft == 0 || this.missionaryLeft >= this.cannibalLeft) &&
                (this.missionaryRight == 0 || this.missionaryRight >= this.cannibalRight)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof State) {
            State other = (State) obj;
            return this.cannibalLeft == other.cannibalLeft && this.missionaryLeft == other.missionaryLeft &&
                    this.boat.equals(other.boat) && this.cannibalRight == other.cannibalRight &&
                    this.missionaryRight == other.missionaryRight;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cannibalLeft, this.missionaryLeft, this.boat, this.cannibalRight,
                this.missionaryRight);
    }
}

public class MissionariesAndCannibals {

    public static List<State> successors(State curState) {
        List<State> children = new ArrayList<>();

        if (curState.boat.equals("left")) {
            generateNewState(curState, children, -2, 0, "right"); // Two missionaries cross left to right.
            generateNewState(curState, children, 0, -2, "right"); // Two cannibals cross left to right.
            generateNewState(curState, children, -1, -1, "right"); // One missionary and one cannibal cross left to
                                                                   // right.
            generateNewState(curState, children, -1, 0, "right"); // One missionary crosses left to right.
            generateNewState(curState, children, 0, -1, "right"); // One cannibal crosses left to right.
        } else {
            generateNewState(curState, children, 2, 0, "left"); // Two missionaries cross right to left.
            generateNewState(curState, children, 0, 2, "left"); // Two cannibals cross right to left.
            generateNewState(curState, children, 1, 1, "left"); // One missionary and one cannibal cross right to left.
            generateNewState(curState, children, 1, 0, "left"); // One missionary crosses right to left.
            generateNewState(curState, children, 0, 1, "left"); // One cannibal crosses right to left.
        }

        return children;
    }

    private static void generateNewState(State curState, List<State> children, int missionaryChange, int cannibalChange,
            String newBoatPosition) {
        State newState = new State(
                curState.cannibalLeft + cannibalChange,
                curState.missionaryLeft + missionaryChange,
                newBoatPosition,
                curState.cannibalRight - cannibalChange,
                curState.missionaryRight - missionaryChange);

        if (newState.isValid()) {
            newState.parent = curState;
            children.add(newState);
        }
    }

    public static State breadthFirstSearch() {
        State initialState = new State(3, 3, "left", 0, 0);
        if (initialState.isGoal()) {
            return initialState;
        }

        Queue<State> frontier = new LinkedList<>();
        Set<State> explored = new HashSet<>();
        frontier.add(initialState);

        while (!frontier.isEmpty()) {
            State state = frontier.poll();

            if (state.isGoal()) {
                return state;
            }

            explored.add(state);
            List<State> children = successors(state);

            for (State child : children) {
                if (!explored.contains(child) && !frontier.contains(child)) {
                    frontier.add(child);
                }
            }
        }

        return null;
    }

    public static void printSolution(State solution) {
        List<State> path = new ArrayList<>();
        path.add(solution);
        State parent = solution.parent;

        while (parent != null) {
            path.add(parent);
            parent = parent.parent;
        }

        for (int i = path.size() - 1; i >= 0; i--) {
            State state = path.get(i);
            System.out.println("(" + state.cannibalLeft + "," + state.missionaryLeft + "," + state.boat + ","
                    + state.cannibalRight + "," + state.missionaryRight + ")");
        }
    }

    public static void main(String[] args) {
        State solution = breadthFirstSearch();
        System.out.println("Missionaries and Cannibals solution:");
        System.out.println("(cannibalLeft,missionaryLeft,boat,cannibalRight,missionaryRight)");
        if (solution != null) {
            printSolution(solution);
        } else {
            System.out.println("No solution found.");
        }
    }
}
