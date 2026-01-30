import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many subjects do you have? ");
        int n = input.nextInt();

        int sum = 0;
        int marks;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks = input.nextInt();

            if (marks > 100) {
                System.out.println("Marks cannot be more than 100. Try again.");
                i--;
            } else if (marks < 0) {
                System.out.println("Marks cannot be negative. Try again.");
                i--;
            } else {
                sum = sum + marks;
            }
        }

        double average = sum / (double) n;
        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 75) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 45) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}

