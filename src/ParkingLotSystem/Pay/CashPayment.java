package ParkingLotSystem.Pay;

public class CashPayment implements Payment{
    int amount;

    public CashPayment(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean makePayment() {
        System.out.println("Cash payment" + amount + " collected");
        return true;
    }
}
