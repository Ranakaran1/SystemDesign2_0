package ParkingLotSystem.Pay;

public class upiPayment implements Payment {
    int amount;

    public upiPayment(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean makePayment() {
        System.out.println("Upi payment amount: " + amount + " collected");
        return true;
    }
}
