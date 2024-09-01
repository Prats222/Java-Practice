package Parking_Lot_Design;

public class ParkingSpot {
    private Vechile vechile;
    private VechileSize spotSize;
    private int row;
    private int spotNumber;
    private Level level;

    public ParkingSpot(Level lvl, int r, int n, VechileSize sz) {
        level = lvl;
        row = r;
        spotNumber = n;
        spotSize = sz;
    }

    public boolean isAvailable() {
        return vechile == null; // spot we are looking for is available only if the vechile we are pointing at
                                // is null
    }

    public boolean canFitVechile(Vechile vehicle) {
        return isAvailable() && vehicle.canFitInSpot(this);
    }

    public boolean park(Vechile v) {
        if (!canFitVechile(v)) {
            return false;
        }
        vechile = v;
        vechile.parkINSpot(this);
        return true;
    }

    public void removeVechile() { // remove from slot and notify that new spot is available
        level.spotFreed();
        vechile = null;
    }

    // getters
    public int getRow() {
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VechileSize getSize() {
        return spotSize;
    }

    // print - to print what size of spot is available , if not which vechile is
    // available there.
    public void print() {
        if (vechile == null) {
            if (spotSize == VechileSize.Compact) {
                System.out.println("C");
            } else if (spotSize == VechileSize.Large) {
                System.out.println("L");
            } else if (spotSize == VechileSize.MotorCycle) {
                System.out.println("M");
            }
        } else {
            vechile.print();
        }
    }
}
