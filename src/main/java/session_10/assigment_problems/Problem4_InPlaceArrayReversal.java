package session_10.assigment_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4_InPlaceArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] values = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int left = 0, right = values.length - 1;
        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(values));
        sc.close();
    }
}
