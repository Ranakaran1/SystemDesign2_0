package ParkingLotSystem.Gate;

import ParkingLotSystem.Parking.ParkingSpot;
import ParkingLotSystem.Parking.ParkingSpotManager;
import ParkingLotSystem.Parking.ParkingSpotManagerFactory;
import ParkingLotSystem.Ticket;
import ParkingLotSystem.Vehicle;
import ParkingLotSystem.VehicleType;

public class EntryGate {


    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager parkingSpotManager;
    static int count =0;
    Ticket enterVehicle(Vehicle vehicle){
        VehicleType vehicleType = vehicle.vehicleType;

        ParkingSpotManager manager = ParkingSpotManagerFactory.getManager(vehicleType);
        ParkingSpot freeParkingSpot = manager.findFreeParkingSpot();
        manager.bookSpot(freeParkingSpot, vehicle);

        Ticket ticket = new Ticket(count++, vehicleType , System.currentTimeMillis(), freeParkingSpot);
        return ticket;



    }

}
