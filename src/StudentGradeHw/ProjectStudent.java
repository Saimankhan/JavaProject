/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGradeHw;

/**
 *
 * @author user
 */
public class ProjectStudent extends Student {
    private double projectGrade;

    public ProjectStudent(String name, int id) {
        super(name, id);
    }

    @Override
    public void inputGrades(double[] grades) {
        if (grades.length > 0) {
            this.projectGrade = grades[0];
        }
    }

    @Override
    public double calculateFinalGrade() {
        return projectGrade;
    }
}

