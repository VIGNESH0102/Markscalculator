
import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner din = new Scanner(System.in);

        
        System.out.print("Enter marks for Subject 1: ");
        int m1 = din.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int m2 = din.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int m3 = din.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        int m4 = din.nextInt();

        System.out.print("Enter marks for Subject 5: ");
        int m5 = din.nextInt();

       
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

       
        String grade;
        if (average > 90) {
            grade = "O";
        } else if (average > 80) {
            grade = "A";
        } else if (average > 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Failed";
        }

        System.out.println("\nTotal Marks: " + total + "/500");
        System.out.println("Average: " + average + "%");
        System.out.println("Grade: " + grade);

    }
}
