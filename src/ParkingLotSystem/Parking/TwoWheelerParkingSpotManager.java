package ParkingLotSystem.Parking;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    List<ParkingSpot> twoWheelerParkingSpotList;
    static List<ParkingSpot> twoWheelerParkingSpots = new ArrayList<>();
    static {
        twoWheelerParkingSpots.add(new ParkingSpot(1));
        twoWheelerParkingSpots.add(new ParkingSpot(2));
        twoWheelerParkingSpots.add(new ParkingSpot(3));
        twoWheelerParkingSpots.add(new ParkingSpot(4));
        twoWheelerParkingSpots.add(new ParkingSpot(5));
        twoWheelerParkingSpots.add(new ParkingSpot(6));
        twoWheelerParkingSpots.add(new ParkingSpot(7));
        twoWheelerParkingSpots.add(new ParkingSpot(8));
        twoWheelerParkingSpots.add(new ParkingSpot(9));
        twoWheelerParkingSpots.add(new ParkingSpot(10));

    }
    TwoWheelerParkingSpotManager(){
        super(twoWheelerParkingSpots);
    }




}
