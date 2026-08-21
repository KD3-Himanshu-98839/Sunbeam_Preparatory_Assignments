public class StudentDetails {
    StudentDetails(String name, String rollNo, int totalMarks) {
        System.out.println("Student name is: " + name);
        System.out.println("Student Roll No is: " + rollNo);
        System.out.println("Student total Marks is: " + totalMarks);

    }

    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails("Himanshu Vinchurekar", "98839Sunbeam", 80);
        System.out.println();
        StudentDetails s2 = new StudentDetails("Arnav Kumar", "98834Sunbeam", 95);

    }
}
