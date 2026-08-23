import java.util.*;

public class FindDuplicateString {
    public static void main(String[] args) {
        List<String> li = new ArrayList<String>(
                List.of("Apple", "Banana", "Mango", "Apple", "Orange", "Banana", "Orange"));

        System.out.println("Duplicate strings: ");

        for (int i = 0; i < li.size(); i++) {
            boolean isDuplicate = false;

            // Checks if the current string has already appeared before.
            // If we don't do this, the same duplicate (like Apple) will be printed multiple times.
            for (int k = 0; k < i; k++) {
                if (li.get(i).equals(li.get(k))) {
                    isDuplicate = true;
                    break; // No need to check further once a previous match is found.
                }
            }

            // Skip this string because it was already processed earlier.
            if (isDuplicate) {
                continue; // Using break here would stop the whole program instead of checking the remaining strings.

            }

            
            for (int j = i + 1; j < li.size(); j++) {
                if (li.get(i).equals(li.get(j))) {
                    System.out.println(li.get(i));
                    break;
                }
            }
        }

    }
}
