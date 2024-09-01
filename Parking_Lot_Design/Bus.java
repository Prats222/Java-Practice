package Parking_Lot_Design;

public class Bus extends Vechile {
    public Bus() {
        spotsNeeded = 5;
        size = VechileSize.Large;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VechileSize.Large;
    }

    public void print() {
        System.out.println("B");
    }
}
