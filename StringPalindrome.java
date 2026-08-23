
import java.util.*;

public class StringPalindrome {

    // method-1 - Using reverse
    public static boolean checkPlaindromeUsingReverse(String str) {
        str = str.toLowerCase();
        return str.equals(new StringBuffer(str).reverse().toString());
    }

    // method 2 - Using pointers
    public static boolean checkPlaindromeUsingTwoPointers(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = (str.length() - 1);
        while (start < end) {
            
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            
            start++;
            end--;
        }
        return true;
    }

    // method 3- using Recursive
    public static boolean checkPlaindromeUsingRecursive(String str) {
        str = str.toLowerCase();
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }
        
        return checkPalindromeByRecursive(str, 0, str.length()-1);

    }

    private static boolean checkPalindromeByRecursive(String str, int left, int right) {
  
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return checkPalindromeByRecursive(str, left + 1, right - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();
 

        if (checkPlaindromeUsingReverse(str) == true) {
            System.out.println("String is Plaindrome");
        } else {
            System.out.println("String is not Plaindrome");
        }

        // if (checkPlaindromeUsingTwoPointers(str) == true) {
        //     System.out.println("String is Plaindrome");
        // } else {
        //     System.out.println("String is not Plaindrome");
        // }

        // if (checkPlaindromeUsingRecursive(str) == true) {
        //     System.out.println("String is Plaindrome");
        // } else {
        //     System.out.println("String is not Plaindrome");
        // }



    }
}