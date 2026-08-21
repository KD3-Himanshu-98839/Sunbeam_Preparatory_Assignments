import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for its fibonacci series.");

        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        int result =0;
        System.out.print(a+" "+b+"");
        for (int i = 2; i < n; i++) {

            result = a+b;
            System.out.print(" "+result);
            a=b;
            b=result;
        }
    }
}
