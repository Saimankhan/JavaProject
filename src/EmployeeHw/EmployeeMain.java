
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeHw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
    private List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        EmployeeMain system = new EmployeeMain();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPayroll Management System Menu:");
             System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. calculate monthly salary");
            System.out.println("5. salary increment");
            
            System.out.println("6. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.addEmployee();
                    break;
                case 2:
                    system.viewEmployee();
                    break;
                case 3:
                    system.searchEmployeeById();
                    break;
                case 4:
                    system.calculateSalary();
                    break;
                case 5:
                    system.salaryIncrement();
                    break;
                case 6:
                    System.out.println("Exiting Product Inventory System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee designation: ");
        String designation = scanner.nextLine();
        
        System.out.print("Enter Employee salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, designation,salary);
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }
    
    
    private void viewEmployee() {
    System.out.println("\nAll Employee:");
    for (Employee employee : employees) {
        System.out.println(employee);
    }
}

    
    private void searchEmployeeById() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Employee ID to search: ");
    int searchId = scanner.nextInt();

    for (Employee employee : employees) {
        if (employee.getEmpId() == searchId) {
            System.out.println("Found product:");
            System.out.println(employee);
            return;
        }
    }
    System.out.println("Product with ID " + searchId + " not found.");
}

    
    private void calculateSalary() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Employee id for check salary: ");
    int employeeId = scanner.nextInt();
  for (Employee employee : employees) {
        if (employee.getEmpId() == employeeId) {
          
           double sl=employee.getSalary();
            System.out.println(" Employee salary: $" +sl);
              return;      
        } 
    }
    
}

    

    private void salaryIncrement() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter employee ID to salary increement: ");
    int employeeId = scanner.nextInt();
     System.out.print(" salary increement amount: ");
    int incrementAmount = scanner.nextInt();

    for (Employee employee : employees) {
        if (employee.getEmpId() == employeeId) {
          
           if (incrementAmount > 0) {
          double newSalary=  employee.getSalary() + incrementAmount;
           employee.setSalary(newSalary);
            System.out.println("Salary incremented successfully. New salary: $" + newSalary);
              return;      
        } 
    }
    
}


            System.out.println("Invalid increment amount. Please enter a positive value.");
        
    // Implement methods for addProduct, viewProducts, searchProductById, updateProduct, and deleteProduct
    // ...
}
}