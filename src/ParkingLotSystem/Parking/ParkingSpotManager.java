package ParkingLotSystem.Parking;

import ParkingLotSystem.Vehicle;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingSpot findFreeParkingSpot(){
         for(ParkingSpot parkingSpot : parkingSpotList){
             if(parkingSpot.isEmpty){
                 return parkingSpot;
             }
         }
         throw new RuntimeException("No ParkingSpot Available");
     }

    public void unBookSpot(ParkingSpot parkingSpot){
         parkingSpot.freeSpot();
     }
    public void bookSpot(ParkingSpot parkingSpot, Vehicle vehicle){
        parkingSpot.bookSlot(vehicle);
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpotList.add(parkingSpot);
    }

    public void removeTwoWheelerParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpotList.remove(parkingSpot);
    }

}
