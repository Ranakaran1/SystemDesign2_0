package VendingMachineImplementation;

import java.util.LinkedList;
import java.util.List;

public class Slot {
    int code;
    List<Product> products;
    boolean isAvailable;
    public Slot(int code) {
        this.code = code;
        products = new LinkedList<>();
        isAvailable = false;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products.addAll(products);
        if(this.products.size()>0){
            isAvailable=true;
        }

    }
    public void addProducts(Product product) {
        this.products.add(product);
        if(this.products.size()>0){
            isAvailable=true;
        }
    }
    public Product buyProduct() {
        if(isAvailable){
            Product product = this.products.removeFirst();
            if(this.products.size()>0){
                isAvailable=true;
            }else{
                isAvailable=false;
            }
            return product;
        }
        return null;
    }

}
