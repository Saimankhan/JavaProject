/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGradeHw;

/**
 *
 * @author user
 */
import java.util.Scanner;

// Base Student class

// ExamStudent class


// AssignmentStudent class

// ProjectStudent class

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an ExamStudent and input grades
        ExamStudent examStudent = new ExamStudent("John Doe", 1);
        System.out.print("Enter exam grades for " + examStudent.name + " (separated by spaces): ");
        String[] examGradesInput = sc.nextLine().split(" ");
        double[] examGrades = new double[examGradesInput.length];
        for (int i = 0; i < examGradesInput.length; i++) {
            examGrades[i] = Double.parseDouble(examGradesInput[i]);
        }
        examStudent.inputGrades(examGrades);
        System.out.println("Final grade for " + examStudent.name + ": " + examStudent.calculateFinalGrade());

        // Create an AssignmentStudent and input grades
        AssignmentStudent assignmentStudent = new AssignmentStudent("Jane Smith", 2);
        System.out.print("Enter assignment grades for " + assignmentStudent.name + " (separated by spaces): ");
        String[] assignmentGradesInput = sc.nextLine().split(" ");
        double[] assignmentGrades = new double[assignmentGradesInput.length];
        for (int i = 0; i < assignmentGradesInput.length; i++) {
            assignmentGrades[i] = Double.parseDouble(assignmentGradesInput[i]);
        }
        assignmentStudent.inputGrades(assignmentGrades);
        System.out.println("Final grade for " + assignmentStudent.name + ": " + assignmentStudent.calculateFinalGrade());

        // Create a ProjectStudent and input the project grade
        ProjectStudent projectStudent = new ProjectStudent("Alice Brown", 3);
        System.out.print("Enter project grade for " + projectStudent.name + ": ");
        double projectGrade = sc.nextDouble();
        projectStudent.inputGrades(new double[]{projectGrade});
        System.out.println("Final grade for " + projectStudent.name + ": " + projectStudent.calculateFinalGrade());
    }
}

