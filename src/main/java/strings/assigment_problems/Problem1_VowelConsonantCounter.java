package strings.class_problems;
public class Problem1_VowelConsonantCounter {
    static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == ' ') continue;
            if ("aeiou".indexOf(ch) >= 0) vowels++;
            else consonants++;
        }
        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }
    public static void main(String[] args) { countVowelsAndConsonants("Java Programming"); }
}