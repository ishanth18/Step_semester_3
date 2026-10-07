package basics.class_problems;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4_FirstNonRepeatingCharacter {
    static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < text.length(); i++)
            frequency.put(text.charAt(i), frequency.getOrDefault(text.charAt(i), 0) + 1);
        for (int i = 0; i < text.length(); i++)
            if (frequency.get(text.charAt(i)) == 1) return text.charAt(i);
        return '\0';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char result = findFirstNonRepeatingChar(text);
        if (result == '\0') System.out.println("No Non-Repeating Character Found");
        else System.out.println("First Non-Repeating Character: '" + result + "'");
        sc.close();
    }
}