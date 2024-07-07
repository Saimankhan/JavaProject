/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductHw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {
    private List<ProductArray> products = new ArrayList<>();

    public static void main(String[] args) {
        ProductMain system = new ProductMain();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nProduct Inventory System Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product Information");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.addProduct();
                    break;
                case 2:
                    system.viewProducts();
                    break;
                case 3:
                    system.searchProductById();
                    break;
                case 4:
                    system.updateProduct();
                    break;
                case 5:
                    system.deleteProduct();
                    break;
                case 6:
                    System.out.println("Exiting Product Inventory System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Product pricr: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter Product quantity: ");
        int quantity = scanner.nextInt();

        ProductArray product = new ProductArray(id, name, price,quantity);
        products.add(product);
        System.out.println("Student added successfully!");
    }
    
    
    private void viewProducts() {
    System.out.println("\nAll Products:");
    for (ProductArray product : products) {
        System.out.println(product);
    }
}

    
    private void searchProductById() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Product ID to search: ");
    int searchId = scanner.nextInt();

    for (ProductArray product : products) {
        if (product.getProductId() == searchId) {
            System.out.println("Found product:");
            System.out.println(product);
            return;
        }
    }
    System.out.println("Product with ID " + searchId + " not found.");
}

    
    private void updateProduct() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Product ID to update: ");
    int productId = scanner.nextInt();

    for (ProductArray product : products) {
        if (product.getProductId() == productId) {
            System.out.print("Enter new Product Name: ");
            String newName = scanner.next();
            product.setName(newName);

            System.out.print("Enter new Product Price: $");
            double newPrice = scanner.nextDouble();
            product.setPrice(newPrice);

            System.out.print("Enter new Product Quantity: ");
            int newQuantity = scanner.nextInt();
            product.setQuantity(newQuantity);

            System.out.println("Product information updated successfully!");
            return;
        }
    }
    System.out.println("Product with ID " + productId + " not found.");
}

    
    private void deleteProduct() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Product ID to delete: ");
    int productId = scanner.nextInt();

    for (ProductArray product : products) {
        if (product.getProductId() == productId) {
            products.remove(product);
            System.out.println("Product deleted successfully!");
            return;
        }
    }
    System.out.println("Product with ID " + productId + " not found.");
}


    // Implement methods for addProduct, viewProducts, searchProductById, updateProduct, and deleteProduct
    // ...
}