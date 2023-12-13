import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter the type of employee");
        String empType = Scan.nextLine();
        Employee e1 = EmployeeFactory.getEmployee(empType);

        // System.out.println("Employee type : " + e1.getClass().getName());
        System.out.println("Employee Salary : " + e1.getSalary());

    }
}
