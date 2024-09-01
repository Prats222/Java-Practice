package Parking_Lot_Design;

public class MotorCycle extends Vechile {
    public MotorCycle() {
        spotsNeeded = 1;
        size = VechileSize.MotorCycle;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return true;
    }

    public void print() {
        System.out.println("M");
    }
}
