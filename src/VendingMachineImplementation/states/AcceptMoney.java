package VendingMachineImplementation.states;
import VendingMachineImplementation.VendingMachine;
import VendingMachineImplementation.Coin;

public class AcceptMoney extends State{
    VendingMachine vendingMachine;
    public AcceptMoney(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    public boolean creditAmount(Coin coin){
        vendingMachine.addMoney(coin.value);
        System.out.println("Money Added " + coin.value + ", total Added Money: " + vendingMachine.getMoney());
        return true;
    }
    public void selectProductButton(){
        vendingMachine.setState(new SelectProduct(vendingMachine));
    }
    public boolean cancelTransaction(){
        if(vendingMachine.getMoney()>0){
            this.refundMoney(vendingMachine.getMoney());
        }
        vendingMachine.setState(new IdleState(vendingMachine));
        return true;
    }
    public int refundMoney(int val){
        System.out.println("Money Refunded " + vendingMachine.getMoney());
        int money = vendingMachine.getMoney();
        vendingMachine.setMoney(0);
        return money;

    }

}
