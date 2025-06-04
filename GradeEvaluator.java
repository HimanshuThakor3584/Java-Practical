import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take numeric grade as input
        System.out.print("Enter your numeric grade (0-100): ");
        int grade = scanner.nextInt();

        // Validate input using if-else
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Please enter a number between 0 and 100.");
        } else {
            // Convert numeric grade to letter grade using if-else
            char letterGrade;

            if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            // Use switch statement to print a message based on letter grade
            switch (letterGrade) {
                case 'A':
                    System.out.println("Excellent! You got an A.");
                    break;
                case 'B':
                    System.out.println("Great job! You got a B.");
                    break;
                case 'C':
                    System.out.println("Good effort! You got a C.");
                    break;
                case 'D':
                    System.out.println("You passed with a D.");
                    break;
                case 'F':
                    System.out.println("Unfortunately, you failed with an F.");
                    break;
                default:
                    System.out.println("Unexpected grade.");
            }
        }

        scanner.close();
    }
}
