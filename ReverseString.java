import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");

        StringBuffer str = new StringBuffer();
        String st = sc.nextLine();
        str.append(st);

        System.out.println("Original String is: "+str);

        StringBuffer reverse = str.reverse();

        System.out.println("Reverse String is: "+reverse);

    }
}
