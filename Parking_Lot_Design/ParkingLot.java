package Parking_Lot_Design;

public class ParkingLot {
    private Level[] levels;
    private final int NUM_LEVELS = 5;

    public ParkingLot() {
        levels = new Level[NUM_LEVELS];
        for (int i = 0; i < NUM_LEVELS; i++) {
            levels[i] = new Level(i, 30);
        }
    }

    public boolean parkVechile(Vechile vechile) {
        for (int i = 0; i < levels.length; i++) {
            if (levels[i].parkVechile(vechile)) {
                return true;
            }
        }
        return false;
    }
}
