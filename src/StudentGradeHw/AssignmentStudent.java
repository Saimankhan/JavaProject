/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGradeHw;

/**
 *
 * @author user
 */
public class AssignmentStudent extends Student {
    private double[] assignmentGrades;

    public AssignmentStudent(String name, int id) {
        super(name, id);
    }

    @Override
    public void inputGrades(double[] grades) {
        this.assignmentGrades = grades;
    }

    @Override
    public double calculateFinalGrade() {
        if (assignmentGrades == null || assignmentGrades.length == 0) return 0.0;
        double sum = 0.0;
        for (double grade : assignmentGrades) {
            sum += grade;
        }
        return sum / assignmentGrades.length;
    }
}
