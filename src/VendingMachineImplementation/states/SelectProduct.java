package VendingMachineImplementation.states;

import VendingMachineImplementation.*;

public class SelectProduct extends State{
    VendingMachine vendingMachine;
    public SelectProduct(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }
    public void selectProductCode(int code){
        Product productByCode = vendingMachine.getProductByCode(code);
        if(productByCode==null){
            this.cancelTransaction();
            return;
        }
        int price = productByCode.productItem.price;
        if(vendingMachine.getMoney()<price){
            vendingMachine.addProductByCode(code, productByCode);
            this.cancelTransaction();
            return;
        }
        else if(vendingMachine.getMoney()>=price){
            returnChange(vendingMachine.getMoney()-price);
        }
        vendingMachine.setState(new DispenseProduct(vendingMachine, productByCode));
    }
    public int returnChange(int val){
        System.out.println("Money returned " + val);
        vendingMachine.setMoney(0);
        return val;
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
