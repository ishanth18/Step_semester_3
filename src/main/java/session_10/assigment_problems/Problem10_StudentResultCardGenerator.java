package session_10.assigment_problems;

import java.util.Scanner;

public class Problem10_StudentResultCardGenerator {
    static class Student {
        private final String name;
        private final int[] marks;

        Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks;
        }

        double calculateAverage() {
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            return (double) total / marks.length;
        }

        char calculateGrade() {
            double average = calculateAverage();
            if (average >= 90) return 'A';
            if (average >= 75) return 'B';
            if (average >= 60) return 'C';
            if (average >= 40) return 'D';
            return 'F';
        }

        void printResult() {
            System.out.printf("%s: Average %.1f, Grade %c%n",
                    name.toUpperCase(), calculateAverage(), calculateGrade());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.next();

        int[] marks = new int[3];
        System.out.println("Enter marks for 3 subjects (0-100):");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Marks must be between 0 and 100.");
                sc.close();
                return;
            }
        }

        new Student(name, marks).printResult();
        sc.close();
    }
}
