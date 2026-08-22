import java.util.Scanner;

public class NumberSystemConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Decimal number: ");
        int decimal = sc.nextInt();
        String binaryString = "";
        String octalString = "";
        String hexadecimalString = "";


        System.out.println("Original Number is: "+decimal);
        
        int decimal_for_binary = decimal;

        while (decimal_for_binary > 0) {
            binaryString = (decimal_for_binary % 2) + binaryString;
            decimal_for_binary = decimal_for_binary / 2;
        }
        System.out.print("Binary equivalent: " + binaryString);

        int decimal_for_octal = decimal;

        while (decimal_for_octal > 0) {
            octalString = (decimal_for_octal % 8) + octalString;
            decimal_for_octal = decimal_for_octal / 8;
        }
        System.out.print("\nOctal equivalent: " + octalString);

        int decimal_for_hexadecimal = decimal;
        
        while (decimal_for_hexadecimal > 0) {
            hexadecimalString = (decimal_for_hexadecimal % 16) + hexadecimalString;
            decimal_for_hexadecimal = decimal_for_hexadecimal / 16;
        }
        System.out.print("\nHexa Decimal equivalent: " + hexadecimalString);

        sc.close();

    }
}
