public class EmployeeDetails {
    String firstname;
    String lastname;
    double monthlysalary;

    public EmployeeDetails(String firstname, String lastname, double monthlysalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        if (monthlysalary > 0) {
            this.monthlysalary = monthlysalary;
        } else {
            monthlysalary = 0.0;
        }
    }

    public void DisplayEmployeeDetails() {
        System.out.print("Employee name: " + firstname + " " + lastname);
        System.out.println("\nMonthly salary: " + monthlysalary);
    }

    // to update employee salary by method rather than hard-coded like {emp1.salary = 35000} wrong practice emp1.modifyEmployeerSalary(35000); right practice.
    public void modifyEmployeerSalary(double newSalary) {
        if (newSalary > 0) {
            monthlysalary = newSalary;
        } else {
            monthlysalary = 0.0;
        }
    }

    public double yearlySalary() {
        return monthlysalary * 12;
    }

    public double increaseInSalary(double Percentage) {
        return monthlysalary += ((monthlysalary * Percentage) / 100);
    }

    public static void main(String[] args) {

        EmployeeDetails emp1 = new EmployeeDetails("Himanshu", "Vinchurkar", 35000);
        EmployeeDetails emp2 = new EmployeeDetails("Pranay", "Kadu", 40000);

        System.out.println("--------------- Employee Details ---------------");
        emp1.DisplayEmployeeDetails();
        System.out.println("Yearly Salary: " + emp1.yearlySalary());

        System.out.println();

        emp2.DisplayEmployeeDetails();
        System.out.println("Yearly Salary: " + emp2.yearlySalary());

        System.out.println();

        emp1.modifyEmployeerSalary(50000);
        emp1.DisplayEmployeeDetails();
        System.out.println("Yearly Salary: " + emp1.yearlySalary());


        emp1.increaseInSalary(10);
        emp2.increaseInSalary(10);

        System.out.println("\n--------------- Employee Details ---------------");
        System.out.println("===== After 10% Salary Increase =====");

        emp1.DisplayEmployeeDetails();
        System.out.println(" Updated Yearly Salary: " + emp1.yearlySalary());

        System.out.println();

        emp2.DisplayEmployeeDetails();
        System.out.println("Updated Yearly Salary: " + emp2.yearlySalary());

    }
}