public class towerOfHanoi {

    public static void main(String[] args) {
        // Solve the Tower of Hanoi with 3 disks, from pole A to pole B using pole C
        moveTower(3, "A", "B", "C");
    }

    public static void moveTower(int height, String fromPole, String toPole, String withPole) {
        if (height >= 1) {
            // Move the tower of height-1 to the auxiliary pole
            moveTower(height - 1, fromPole, withPole, toPole);
            // Move the remaining disk to the target pole
            moveDisk(fromPole, toPole);
            // Move the tower from the auxiliary pole to the target pole
            moveTower(height - 1, withPole, toPole, fromPole);
        }
    }

    public static void moveDisk(String fromPole, String toPole) {
        System.out.println("Moving disk from " + fromPole + " to " + toPole);
    }
}
