package session_10.assigment_problems;

import java.util.Scanner;

public class Problem8_StudentGradeAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks out of 100: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
        sc.close();
    }
}
