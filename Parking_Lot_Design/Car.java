package Parking_Lot_Design;

public class Car extends Vechile {
    public Car() {
        spotsNeeded = 1;
        size = VechileSize.Compact;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VechileSize.Large || spot.getSize() == VechileSize.Compact;
    }

    public void print() {
        System.out.println("C");
    }
}
