package ParkingLotSystem.Parking;

import ParkingLotSystem.Vehicle;

public class ParkingSpot {
    int id;
    Vehicle v;
    boolean isEmpty;

    public ParkingSpot(int id) {
        this.id = id;
        this.v = null;
        this.isEmpty = false;
    }
    void bookSlot(Vehicle v){
        this.v = v;
        this.isEmpty = false;
    }
    void freeSpot() {
        this.v = null;
        this.isEmpty = false;
    }
}
