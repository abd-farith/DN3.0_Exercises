// Step 1: Understanding the problem is completed in Understanding.txt
// Step 4: Analysis is completed in Analysis.txt

import java.util.Arrays;

public class MainEcommerce {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Tablet", "Electronics"),
            new Product(4, "Headphones", "Accessories"),
            new Product(5, "Charger", "Accessories")
        };

        Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));

        ProductSearch search = new ProductSearch(products);

        System.out.println("Linear Search for 'Tablet':");
        Product product = search.linearSearchByName("Tablet");
        if (product != null) {
            System.out.println("Found: " + product.getProductName() + " in category " + product.getCategory());
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nBinary Search for 'Tablet':");
        product = search.binarySearchByName("Tablet");
        if (product != null) {
            System.out.println("Found: " + product.getProductName() + " in category " + product.getCategory());
        } else {
            System.out.println("Product not found.");
        }
    }
}
