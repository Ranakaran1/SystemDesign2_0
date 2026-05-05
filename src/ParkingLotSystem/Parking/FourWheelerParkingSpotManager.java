package ParkingLotSystem.Parking;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    List<ParkingSpot> fourWheelerParkingSpotList;
    static List<ParkingSpot> fourWheelerParkingSpots = new ArrayList<>();
    static {
        fourWheelerParkingSpots.add(new ParkingSpot(1));
        fourWheelerParkingSpots.add(new ParkingSpot(2));
        fourWheelerParkingSpots.add(new ParkingSpot(3));
        fourWheelerParkingSpots.add(new ParkingSpot(4));
        fourWheelerParkingSpots.add(new ParkingSpot(5));
        fourWheelerParkingSpots.add(new ParkingSpot(6));
        fourWheelerParkingSpots.add(new ParkingSpot(7));
        fourWheelerParkingSpots.add(new ParkingSpot(8));
        fourWheelerParkingSpots.add(new ParkingSpot(9));
        fourWheelerParkingSpots.add(new ParkingSpot(10));

    }
    FourWheelerParkingSpotManager(){
        super(fourWheelerParkingSpots);
    }


}
