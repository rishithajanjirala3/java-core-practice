package myPackage;
import java.util.*;

public class Marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to give marks");
            System.out.println("Enter 0 to stop");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } 
                else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } 
                else if (marks >= 0 && marks <= 59) {
                    System.out.println("Improve yourself..!");
                } 
                else {
                    System.out.println("Enter valid marks");
                }
            }
            else if (choice != 0) {
                System.out.println("Enter valid choice (0 or 1)");
            }

        } while (choice != 0); 
        System.out.println("Program stops taking input");
        sc.close();
    }
}
