import java.util.ArrayList;
import java.util.Scanner;

public class studentgradetracker1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Welcome to the Student Grade Tracker");

        // Input grades
        while (true) {
            System.out.print("Enter a student's grade (or -1 to finish): ");
            double grade = scanner.nextDouble();

            if (grade == -1) {
                break;
            } else if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
            } else {
                grades.add(grade);
            }
        }

        // Check if any grades were entered
        if (grades.isEmpty()) {
            System.out.println("No grades entered. Exiting program.");
            return;
        }

        // Calculate average, highest, and lowest grades
        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = sum / grades.size();

        // Display results
        System.out.println("\nGrade Summary:");
        System.out.printf("Average Grade: %.2f%n", average);
        System.out.printf("Highest Grade: %.2f%n", highest);
        System.out.printf("Lowest Grade: %.2f%n", lowest);

        scanner.close();
    }
}
