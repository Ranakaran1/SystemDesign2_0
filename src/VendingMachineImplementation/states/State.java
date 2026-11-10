package VendingMachineImplementation.states;

import VendingMachineImplementation.Coin;
import VendingMachineImplementation.Product;

public class State {
     public void pressInsertCashButton(){
         System.out.println("pressInsertCashButton method is invallid");
     }
    public boolean creditAmount(Coin coin){
         System.out.println("creditAmount method is invallid");
         return false;
     }
    public int returnChange(int val){
         System.out.println("returnChange method is invallid");
         throw new RuntimeException("Method not allowed");
     }
    public int refundMoney(int val){
        System.out.println("refundMoney method is invallid");
        throw new RuntimeException("Method not allowed");
    }
    public void selectProductButton(){
        System.out.println("selectProductButton method is invallid");
        throw new RuntimeException("Method not allowed");
    }
    public void selectProductCode(int code){
        System.out.println("selectProduct method is invallid");
        throw new RuntimeException("Method not allowed");
    }

    public Product dispenseProduct(Product product){
        System.out.println("dispenseProduct method is invallid");
        throw new RuntimeException("Method not allowed");
    }
    public boolean cancelTransaction(){
        System.out.println("CancelTransaction method is invallid");
        throw new RuntimeException("Method not allowed");
    }
}
