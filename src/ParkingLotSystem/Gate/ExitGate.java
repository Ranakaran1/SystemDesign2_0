package ParkingLotSystem.Gate;

import ParkingLotSystem.Parking.ParkingSpotManager;
import ParkingLotSystem.Parking.ParkingSpotManagerFactory;
import ParkingLotSystem.Pay.CashPayment;
import ParkingLotSystem.Pay.Payment;
import ParkingLotSystem.Pay.upiPayment;
import ParkingLotSystem.Ticket;
import ParkingLotSystem.VehicleType;

public class ExitGate {

    Payment payment;
    Ticket ticket;
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    ParkingSpotManager parkingSpotManager;

    public boolean makePayment(String paymenyMethod, int amount){
        if(paymenyMethod.equalsIgnoreCase("cash")){
            payment = new CashPayment(amount);
            payment.makePayment();
        }else{
            payment = new upiPayment(amount);
            payment.makePayment();
        }
        return true;
    }

    boolean takeExit(Ticket ticket){
        VehicleType vehicleType = ticket.vehicleType;
        return false;

    }

}
