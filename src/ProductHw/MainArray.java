/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductHw;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author user
 */
public class MainArray {
    static Product_Inventory a[] = new Product_Inventory[50]; 
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        while (true) {
            System.out.println("\n1. Add new product");
            System.out.println("2. Update product information");
            System.out.println("3. Display all products");
            System.out.println("4. Search product");
            System.out.println("5. Remove product");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");
            char op = sc.next().charAt(0);
            MainArray m = new MainArray();
            sc.nextLine();
            switch (op) {
                case '1':
                    m.create(sc);
                    break;
                case '2':
                    m.update(sc);
                    break;
                case '3':
                    m.show(sc);
                    break;
                case '4':
                    m.search(sc);
                    break;
                case '5':
                    m.delete(sc);
                    break;
                case '6':
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    void create(Scanner sc) {
        System.out.print("Enter product ID: ");
        String ID = sc.nextLine();
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();
        a[cnt] = new Product_Inventory(ID, name, price, quantity);
        cnt++;
    }

    void update(Scanner sc) {
        System.out.print("Enter product ID: ");
        String ID = sc.nextLine();
        Product_Inventory p = Find(ID);
        if (p == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.print("Enter new price: ");
        double price = sc.nextDouble();
        System.out.print("Enter new quantity: ");
        int quantity = sc.nextInt();
        p.setPrice(price);
        p.setQuantity(quantity);
    }

    void show(Scanner sc) {
        for (int i = 0; i < cnt; i++) {
            System.out.println();
            a[i].display();
        }
    }

    void search(Scanner sc) {
        System.out.print("Enter product ID: ");
        String ID = sc.nextLine();
        Product_Inventory p = Find(ID);
        if (p == null) {
            System.out.println("Product not found.");
            return;
        }
        p.display();
    }

    void delete(Scanner sc) {
        System.out.print("Enter product ID: ");
        String ID = sc.nextLine();
        Product_Inventory p = Find(ID);
        if (p == null) {
            System.out.println("Product not found.");
            return;
        }
        for (int i = 0; i < cnt; i++) {
            if (a[i].ID.equals(ID)) {
                for (int j = i; j < cnt - 1; j++) {
                    a[j] = a[j + 1];
                }
                cnt--;
                break;
            }
        }
    }

    Product_Inventory Find(String ID) {
        for (int i = 0; i < cnt; i++) {
            if (a[i].ID.equals(ID)) {
                return a[i];
            }
        }
        return null;
    }
}
