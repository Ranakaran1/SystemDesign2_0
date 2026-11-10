package VendingMachineImplementation.states;

import VendingMachineImplementation.*;

public class DispenseProduct extends State{
    VendingMachine vendingMachine;

    public DispenseProduct(VendingMachine vendingMachine, Product product){
        this.vendingMachine=vendingMachine;
        this.dispenseProduct(product);
    }
    public Product dispenseProduct(Product product){
        System.out.println("Product Dispanced!!, Hope you like it");
        vendingMachine.setState(new IdleState(vendingMachine));
        return product;
    }

}
