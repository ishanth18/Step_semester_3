package strings.class_problems;
public class Problem5_BankTransactionReference {
    static String normalizeReference(String raw) {
        String reference = raw.trim();
        if (reference.length() < 3) return reference.toUpperCase();
        return reference.substring(0, 3).toUpperCase() + reference.substring(3);
    }
    static String validateAndFormat(String reference) {
        String r = normalizeReference(reference);
        if (r.length() != 14) return "Invalid: wrong length";
        for (int i = 0; i < 3; i++)
            if (!Character.isLetter(r.charAt(i))) return "Invalid: bank code must be 3 letters";
        for (int i = 3; i < 14; i++)
            if (!Character.isDigit(r.charAt(i))) return "Invalid: body must contain only digits";
        return String.format("[%s] DATE: %s/%s/%s | SEQ: %s",
                r.substring(0, 3), r.substring(3, 5), r.substring(5, 7),
                r.substring(7, 9), r.substring(9));
    }
    public static void main(String[] args) {
        System.out.println(validateAndFormat(" hdf03022600042 "));
        System.out.println(validateAndFormat("12F03022600042"));
    }
}