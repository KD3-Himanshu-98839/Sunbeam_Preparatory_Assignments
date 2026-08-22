import java.util.*;
public class SortStudentName {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       List<String> studeList = new ArrayList<>();
       
       System.out.println("Enter upto 10 student name:");
       while (studeList.size()<10) {
         System.out.print("Enter name "+(studeList.size()+1)+" is: ");
         String student = sc.nextLine().trim();
         studeList.add(student);
       }

       Collections.sort(studeList);

       System.out.println("Sorted list of Student: ");
      for (String string : studeList) {
        System.out.println(string);
      }
    }
}
