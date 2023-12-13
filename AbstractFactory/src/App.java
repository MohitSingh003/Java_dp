public class App {
    public static void main(String[] args) throws Exception {
        
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());

        System.out.println("Salary : " + e1.getSalary());
        System.out.println("Salary : " + e2.getSalary());


    }
}
