import java.util.*;

public class CharacterClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        int upper_count = 0;
        int lower_count = 0;
        int digit_count = 0;
        int other_count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper_count++;
            } else if (Character.isLowerCase(ch)) {
                lower_count++;
            } else if (Character.isDigit(ch)) {
                digit_count++;
            } else {
                other_count++;
            }
        }

        System.out.println("Count of Upper Letter: " + upper_count);
        System.out.println("Count of Lower Letter: " + lower_count);
        System.out.println("Count of Digit: " + digit_count);
        System.out.println("Count of other Charachter: " + other_count);

        sc.close();
    }
}
