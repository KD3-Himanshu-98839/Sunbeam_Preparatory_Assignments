public class EmployeeDetails{
    String firstname; 
    String lastname;
    double monthlysalary;

    public EmployeeDetails(String firstname, String lastname, double monthlysalary){
        this.firstname = firstname;
        this.lastname = lastname;
        if (monthlysalary > 0) {
            this.monthlysalary = monthlysalary;
        }else{
            monthlysalary = 0.0;
        }
    }

    public void DisplayEmployeeDetails(){
        System.out.print("Employee name: "+firstname+" "+lastname);
        System.out.println("Monthly salary: "+monthlysalary);
    }



    public static void main(String[] args) {

        
    }
}