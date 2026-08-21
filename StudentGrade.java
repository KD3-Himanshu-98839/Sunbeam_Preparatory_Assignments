import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the marks of 5 subjects out of 20 :");
        System.out.print("C language: ");
        int c = sc.nextInt();
        System.out.print("Java: ");
        int java = sc.nextInt();
        System.out.print("DBMS: ");
        int dbms = sc.nextInt();
        System.out.print("DSA: ");
        int dsa = sc.nextInt();
        System.out.print(".NET: ");
        int dnet = sc.nextInt();

        int total = (c + java + dbms + dsa + dnet);
        System.out.println("Total marks out of 100: "+total);

        if (total >= 90 && total <= 100) {
            System.out.println("Excellent");
        } else if (total >= 80 && total < 90) {
            System.out.println("A");
        } else if (total >= 70 && total < 80) {
            System.out.println("B");
        } else if (total >= 60 && total < 70) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }

        /*
         * if we want to use Switch
         * switch (total / 10) {
         * case 10:
         * case 9:
         * System.out.println("Excellent");
         * break;
         * 
         * case 8:
         * System.out.println("A");
         * break;
         * 
         * case 7:
         * System.out.println("B");
         * break;
         * 
         * case 6:
         * System.out.println("Average");
         * break;
         * 
         * default:
         * System.out.println("Fail");
         * break;
         * }
         */
    }
}
