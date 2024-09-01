package Parking_Lot_Design;

public class Level {
    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0;
    private static final int SPOT_PER_ROW = 10;

    public Level(int flr, int numberSpots) {
        floor = flr;
        spots = new ParkingSpot[numberSpots];
        int largeSpots = numberSpots / 4;
        int bikeSpots = numberSpots / 4;
        int compactSpots = numberSpots - largeSpots - bikeSpots;
        for (int i = 0; i < numberSpots; i++) {
            VechileSize sz = VechileSize.MotorCycle;
            if (i < largeSpots) {
                sz = VechileSize.Large;
            } else if (i < largeSpots + compactSpots) {
                sz = VechileSize.Compact;
            }
            int row = i / SPOT_PER_ROW;
            spots[i] = new ParkingSpot(this, row, i, sz);
        }
        availableSpots = numberSpots;
    }

    public int availableSpots() {
        return availableSpots;
    }

    public boolean parkVechile(Vechile vechile) {
        if (availableSpots() < vechile.getSpotsNeeded()) {
            return false;
        }
        int spotNumber = findAvailableSpots(vechile);
        if (spotNumber < 0) {
            return false;
        }
        return parkStaraightAtSpot(spotNumber, vechile);
    }

    private boolean parkStaraightAtSpot(int spotNumber, Vechile vechile) {
        vechile.clearSpots();
        boolean success = true;
        for (int i = spotNumber; i < spotNumber + vechile.spotsNeeded; i++) {
            success &= spots[i].park(vechile);
        }
        availableSpots -= vechile.spotsNeeded;
        return success;
    }

    private int findAvailableSpots(Vechile vehicle) {
        int spotsNeeded = vehicle.getSpotsNeeded();
        int lastRow = -1;
        int spotsFound = 0;
        for (int i = 0; i < spots.length; i++) {
            ParkingSpot spot = spots[i];
            if (lastRow != spot.getRow()) {
                spotsFound = 0;
                lastRow = spot.getRow();
            }
            if (spot.canFitVechile(vehicle)) {
                spotsFound++;
            } else {
                spotsFound = 0;
            }
            if (spotsFound == spotsNeeded) {
                return i - (spotsNeeded - 1);
            }
        }
        return -1;
    }

    public void print() {
        int lastRow = -1;
        for (int i = 0; i < spots.length; i++) {
            ParkingSpot spot = spots[i];
            if (spot.getRow() != lastRow) {
                System.out.println("  ");
            }
            spot.print();
        }
    }

    public void spotFreed() {
        availableSpots++;
    }
}
