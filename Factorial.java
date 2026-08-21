import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();
        
        if (num<0) {
            System.out.println("Number is negative or invalid");
        } else if (num == 1) {
           System.out.println("Factorial of "+num+" is 1.");
        }
        else{
            int result = 1;
            for (int i = 2; i <=num; i++) {
                result = result *i;
            }

            System.out.println("Factorial of "+num+" is "+result);
        }



        // Recursive method for Factorial
    //    System.out.println(factorial(num)); 

        sc.close();
    }

        // public static int factorial(int n){
        //     if (n<=1) {
        //         return 1;
        //     }
        //     return n * factorial(n-1); 
        // }


}
