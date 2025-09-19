import java.util.Scanner;

public class StudentGradeCalculator {

    public void calculateGrade() {
        Scanner scanner = new Scanner(System.in);

        int numSubjects;

        // Validate number of subjects input (must be 1–8)
        while (true) {
            System.out.print("Enter the number of subjects (1–8): ");
            if (scanner.hasNextInt()) {
                numSubjects = scanner.nextInt();
                if (numSubjects >= 1 && numSubjects <= 8) {
                    break; // valid input
                } else {
                    System.out.println("  Number of subjects must be between 1 and 8.");
                }
            } else {
                System.out.println("  Invalid input! Please enter an integer.");
                scanner.next(); // discard invalid input
            }
        }

        int[] marks = new int[numSubjects];
        int total = 0;

        // Read marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            while (true) {
                System.out.print("Enter marks for subject " + (i + 1) + " (0–100): ");
                if (scanner.hasNextInt()) {
                    int mark = scanner.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        marks[i] = mark;
                        total += mark;
                        break;
                    } else {
                        System.out.println("  Invalid mark! Please enter a value between 0 and 100.");
                    }
                } else {
                    System.out.println("  Invalid input! Please enter a number.");
                    scanner.next(); // clear wrong input
                }
            }
        }

        // Calculate average
        double average = (double) total / numSubjects;

        // Determine grade
        char grade;
        if (average >= 80) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Display results (rounded average)
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average: %.2f%n", average); // formatted to 2 decimals
        System.out.println("Grade: " + grade);
        System.out.println("Thanks for using Student Grade Calculator");
        System.out.println("GoodBye : Design by Sajid Hussain");
    }
}