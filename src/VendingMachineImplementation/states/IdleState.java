package VendingMachineImplementation.states;

import VendingMachineImplementation.VendingMachine;

public class IdleState extends State{
    VendingMachine vendingMachine;
    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }

    @Override
    public void pressInsertCashButton(){
        System.out.println("State changes to AcceptMoney, now insert Cash");
        vendingMachine.setState(new AcceptMoney(vendingMachine));

    };
}
