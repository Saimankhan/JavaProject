/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehicleHw;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleMain {

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private double totalEarnings = 0.0;

    public static void main(String[] args) {
        VehicleMain system = new VehicleMain();
        Scanner scanner = new Scanner(System.in);
        system.initializeVehicles();

        while (true) {
            System.out.println("\nVehicle Rental System Menu:");
            System.out.println("1. Rent a vehicle");
            System.out.println("2. Return a rented vehicle");
            System.out.println("3. Display available vehicles");
            System.out.println("4. Display rented vehicles");
            System.out.println("5. Calculate total rental earnings");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    system.rentVehicle(scanner);
                    break;
                case 2:
                    system.returnVehicle(scanner);
                    break;
                case 3:
                    system.displayAvailableVehicles();
                    break;
                case 4:
                    system.displayRentedVehicles();
                    break;
                case 5:
                    system.calculateTotalEarnings();
                    break;
                case 6:
                    System.out.println("Exiting Vehicle Rental System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void initializeVehicles() {
        vehicles.add(new Vehicle("V001", "Car", "Toyota Camry", 50.0));
        vehicles.add(new Vehicle("V002", "Bike", "Yamaha FZ", 20.0));
        vehicles.add(new Vehicle("V003", "Car", "Honda Civic", 55.0));
        vehicles.add(new Vehicle("V004", "Truck", "Ford F-150", 80.0));
        vehicles.add(new Vehicle("V005", "Van", "Dodge Caravan", 70.0));
    }

    private void rentVehicle(Scanner scanner) {
        System.out.print("Enter vehicle ID to rent: ");
        String vehicleID = scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleID().equals(vehicleID)) {
                if (!vehicle.isRented()) {
                    vehicle.rent();
                    totalEarnings += vehicle.getRentalRate();
                } else {
                    System.out.println("Vehicle is already rented.");
                }
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    private void returnVehicle(Scanner scanner) {
        System.out.print("Enter vehicle ID to return: ");
        String vehicleID = scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleID().equals(vehicleID)) {
                if (vehicle.isRented()) {
                    vehicle.returnVehicle();
                } else {
                    System.out.println("Vehicle is not currently rented.");
                }
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    private void displayAvailableVehicles() {
        System.out.println("\nAvailable Vehicles:");
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isRented()) {
                System.out.println(vehicle);
            }
        }
    }

    private void displayRentedVehicles() {
        System.out.println("\nRented Vehicles:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isRented()) {
                System.out.println(vehicle);
            }
        }
    }

    private void calculateTotalEarnings() {
        System.out.println("Total rental earnings: " + totalEarnings + " Taka");
    }
}
