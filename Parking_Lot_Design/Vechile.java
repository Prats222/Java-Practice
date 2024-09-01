package Parking_Lot_Design;

import java.util.ArrayList;

// abstract info of a vechile
public abstract class Vechile {
    protected ArrayList<ParkingSpot> parkingSPOTS = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VechileSize size;

    // getters
    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public VechileSize getSize() {
        return size;
    }

    // Park vechile or remove it from spot
    public void parkINSpot(ParkingSpot spot) {
        parkingSPOTS.add(spot);
    }

    // clear
    public void clearSpots() {
        for (int i = 0; i < parkingSPOTS.size(); i++) {
            parkingSPOTS.get(i).removeVechile();
        }
        parkingSPOTS.clear();
    }

    // Methods for vechile
    public abstract boolean canFitInSpot(ParkingSpot spot);

    public abstract void print();
}
