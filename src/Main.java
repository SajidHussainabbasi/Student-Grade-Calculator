/*🎓 Student Grade Calculator
Concepts used: Arrays, loops, input/output, conditionals.
Ask the user for the number of subjects.
 Read marks for each subject into an array.
 Calculate the total and average.
Use if-else to assign a grade:
 A for average ≥ 80
 B for 60–79
  C for 40–59
  F for below 40
 */


public class Main {
    public static void main(String[] args) {
        StudentGradeCalculator calculator = new StudentGradeCalculator();
        calculator.calculateGrade();
    }
}