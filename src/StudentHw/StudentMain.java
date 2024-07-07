/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentHw;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain{
    private List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        StudentMain system = new StudentMain();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student Information");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.addStudent();
                    break;
                case 2:
                    system.viewStudents();
                    break;
                case 3:
                    system.searchStudentById();
                    break;
                case 4:
                    system.updateStudent();
                    break;
                case 5:
                    system.deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting Student Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    // Add a new student
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(id, name, grade);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewStudents() {
        System.out.println("\nAll Students:");
        students.forEach(System.out::println);
    }

    // Search student by ID
    public void searchStudentById() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Found student:");
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Update a student's details
    public void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new student name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new student grade: ");
        String newGrade = scanner.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setGrade(newGrade);
                System.out.println("Student information updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
// Delete a student by ID
public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();

        students.removeIf(s -> s.getId() == id);
    System.out.println("Student with ID " + id + " deleted successfully!");
}
}