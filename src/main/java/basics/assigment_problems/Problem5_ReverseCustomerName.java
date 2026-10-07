package basics.class_problems;
import java.util.Scanner;

public class Problem5_ReverseCustomerName {
    static String reverseCustomerName(String customerName) {
        char[] chars = customerName.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) reversed.append(chars[i]);
        return reversed.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reverseCustomerName(name));
        sc.close();
    }
}