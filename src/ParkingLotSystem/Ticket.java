package ParkingLotSystem;

import ParkingLotSystem.Parking.ParkingSpot;

import java.util.Date;

public class Ticket {
    public int id;
    public VehicleType vehicleType;
    public long entryTime;
    public ParkingSpot parkingSpot;

    public Ticket(int id, VehicleType vehicleType, long entryTime, ParkingSpot parkingSpot) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }

}
