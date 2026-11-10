package VendingMachineImplementation;

import VendingMachineImplementation.states.State;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = VendingMachine.getInstance();
        Inventory inventory = vendingMachine.inventory;
        System.out.println("Select Product");
        for(int i=0;i<inventory.slots.length;i++){
            Slot slot = inventory.slots[i];
            if(slot.isAvailable){
                System.out.print("Id: " + slot.code + " | ");
                System.out.println(slot.products.get(0).productItem);
            }
        }
        State currentState = vendingMachine.state;
        currentState.pressInsertCashButton();

        currentState = vendingMachine.state;
        currentState.creditAmount(Coin.TWENTY);
        currentState.creditAmount(Coin.TWENTY);
        currentState.selectProductButton();

        currentState = vendingMachine.state;
        currentState.selectProductCode(2);


    }


}
