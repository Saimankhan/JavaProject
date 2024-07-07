/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentGradeHw;

/**
 *
 * @author user
 */

    
  public class ExamStudent extends Student {
    private double[] examGrades;

    public ExamStudent(String name, int id) {
        super(name, id);
    }

    @Override
    public void inputGrades(double[] grades) {
        this.examGrades = grades;
    }

    @Override
    public double calculateFinalGrade() {
        if (examGrades == null || examGrades.length == 0) return 0.0;
        double sum = 0.0;
        for (double grade : examGrades) {
            sum += grade;
        }
        return sum / examGrades.length;
    }
}
