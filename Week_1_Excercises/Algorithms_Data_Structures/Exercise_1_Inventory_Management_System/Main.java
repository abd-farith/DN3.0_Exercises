// Step 1: Understanding the problem is completed in Understanding.txt
// Step 4: Analysis is completed in Analysis.txt

import java.util.HashMap;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public String getCategory() {
        throw new UnsupportedOperationException("Unimplemented method 'getCategory'");
    }
}

class InventoryManagementSystem {
    private HashMap<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }
}

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product product1 = new Product("001", "Product 1", 100, 10.99);
        Product product2 = new Product("002", "Product 2", 200, 20.99);

        ims.addProduct(product1);
        ims.addProduct(product2);

        System.out.println("Added Products:");
        System.out.println(ims.getProduct("001"));
        System.out.println(ims.getProduct("002"));

        ims.updateProduct("001", 150, 11.99);
        System.out.println("Updated Product 1:");
        System.out.println(ims.getProduct("001"));

        ims.deleteProduct("002");
        System.out.println("After Deleting Product 2:");
        System.out.println(ims.getProduct("002"));
    }
}
