import java.util.*;
public class CountOccurenceOfAlphabates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] count = new int[26];

        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));

            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++;
            }
        }

        
        System.out.println("Occurrences of Alphabets:");
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) ('A' + i) + " : " + count[i]);
            }
        }

        sc.close();
    }
}
