package VendingMachineImplementation;

public class Product {
    int id;
    public ProductItem productItem;

    public Product(int id, ProductItem productItem) {
        this.id = id;
        this.productItem = productItem;
    }
}
