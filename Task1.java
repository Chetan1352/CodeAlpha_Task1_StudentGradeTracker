package amstack.codealpha;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the grades for each student (Enter -1 to finish):");

        while (true) {
            System.out.print("Enter a grade: ");
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered. Exiting.");
            return;
        }

        // Calculate average, highest, and lowest grades
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) sum / grades.size();
        System.out.println("Grades entered: " + grades);
        System.out.println("Average: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
