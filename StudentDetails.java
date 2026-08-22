import java.util.Scanner;

public class StudentDetails {
    StudentDetails(String name, String rollNo, int totalMarks) {
        System.out.println("Student name is: " + name);
        System.out.println("Student Roll No is: " + rollNo);
        System.out.println("Student total Marks is: " + totalMarks);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        String rollNo = sc.nextLine();

        System.out.print("Enter total marks: ");
        int totalMarks = sc.nextInt();
        StudentDetails s1 = new StudentDetails(name, rollNo, totalMarks);

        sc.close();
    }
}
