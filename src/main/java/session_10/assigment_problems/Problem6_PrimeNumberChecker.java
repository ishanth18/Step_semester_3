package session_10.assigment_problems;

import java.util.Scanner;

public class Problem6_PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 1: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Enter a number greater than 1.");
        } else {
            boolean prime = true;
            for (int i = 2; i <= number / i; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.println(number + (prime ? " is prime" : " is not prime"));
        }
        sc.close();
    }
}
