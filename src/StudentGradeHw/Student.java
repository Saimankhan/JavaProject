/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGradeHw;

/**
 *
 * @author user
 */
public class Student {
    protected String name;
    protected int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to input grades using an array parameter
    public void inputGrades(double[] grades) {
        // Base implementation (can be overridden by subclasses)
    }

    public double calculateFinalGrade() {
        // Base implementation
        return 0.0;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", ID: " + id;
    }
}

