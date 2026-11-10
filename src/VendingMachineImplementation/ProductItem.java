package VendingMachineImplementation;

public enum ProductItem {
    COKE(25),
    PEPSI(25),
    PUNJABI_TADKA(20),
    MOONGDAAL_NAMKEEN(20);

    public int price;
    ProductItem(int price){
        this.price = price;
    }


}
