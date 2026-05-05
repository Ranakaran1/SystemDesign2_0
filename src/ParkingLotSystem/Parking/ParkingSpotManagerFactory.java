package ParkingLotSystem.Parking;

import ParkingLotSystem.VehicleType;

public class ParkingSpotManagerFactory {

    public static ParkingSpotManager getManager(VehicleType v){
        if(v== VehicleType.TWO_WHEELER){
            return new TwoWheelerParkingSpotManager();
        }else if(v== VehicleType.FOUR_WHEELER){
            return new FourWheelerParkingSpotManager();
        }else {
            return null;
        }
    }
}
