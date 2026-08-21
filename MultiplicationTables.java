import java.util.Scanner;
public class MultiplicationTables{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the last number: ");
        int last = sc.nextInt();

        for (int i = first; i <=last; i++) {
            System.out.println("Table of "+i+" is:");
            for (int j = 1; j <=10; j++) {
                System.out.println(i+"X"+j+"="+(i*j));
            }
            System.out.println();
        }
    }
}