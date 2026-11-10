package VendingMachineImplementation;

import VendingMachineImplementation.states.IdleState;
import VendingMachineImplementation.states.State;

public class VendingMachine {
    State state;
    int money;
    Inventory inventory;
    static VendingMachine vendingMachine;
    private VendingMachine(){
        this.state = new IdleState(this);
        money=0;
        inventory = new Inventory();
        prepareInventory(inventory);
    }
    public static VendingMachine getInstance(){
        if(vendingMachine==null){
            synchronized (VendingMachine.class){
                if (vendingMachine == null) {
                    vendingMachine = new VendingMachine();
                }
            }

        }
        return vendingMachine;
    }
    public void setState(State state){
        this.state = state;
    }

    public void addMoney(int value) {
        money+=value;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public State getState() {
        return state;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Product getProductByCode(int code) {
        if(code>10){
            System.out.println("Invalid code");
            return null;
        }
        Slot currentSlot = getInventory().slots[code];
        if(!currentSlot.isAvailable){
            System.out.println("Product out of Stock");
            return null;
        }
        return currentSlot.buyProduct();
    }
    public void addProductByCode(int code, Product product) {
        if(code>10){
            System.out.println("Invalid code");
            return ;
        }
        Slot currentSlot = getInventory().slots[code];
        currentSlot.addProducts(product);

    }
    private void prepareInventory(Inventory inventory) {

        for (int i = 0; i < inventory.slots.length; i++) {
            Slot slot = new Slot(i);
            inventory.slots[i] = slot;

            ProductItem item;
            switch (i) {
                case 0: item = ProductItem.COKE; break;
                case 1: item = ProductItem.PEPSI; break;
                case 2: item = ProductItem.PUNJABI_TADKA; break;
                case 3: item = ProductItem.MOONGDAAL_NAMKEEN; break;
                default: item = ProductItem.COKE;
            }


            for (int j = 0; j < 5; j++) {
                Product product = new Product(j, item);
                slot.addProducts(product);
            }
        }

    }
}
