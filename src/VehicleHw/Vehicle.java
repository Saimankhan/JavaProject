/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehicleHw;



public class Vehicle {
    private String vehicleID;
    private String type;
    private String model;
    private double rentalRate;
    private boolean isRented;

    public Vehicle(String vehicleID, String type, String model, double rentalRate) {
        this.vehicleID = vehicleID;
        this.type = type;
        this.model = model;
        this.rentalRate = rentalRate;
        this.isRented = false;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println(model + " has been rented.");
        } else {
            System.out.println(model + " is already rented.");
        }
    }

    public void returnVehicle() {
        if (isRented) {
            isRented = false;
            System.out.println(model + " has been returned.");
        } else {
            System.out.println(model + " is not currently rented.");
        }
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleID + ", Type: " + type + ", Model: " + model + ", Rental Rate: " + rentalRate + " per day, Rented: " + isRented;
    }
}
