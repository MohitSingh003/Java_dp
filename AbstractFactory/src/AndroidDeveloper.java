public class AndroidDeveloper implements Employee {

    @Override
    public int getSalary() {
        System.out.println("Getting salary for Android Developer");
        return 50000;
    }

    @Override
    public String getEmployeeType() {
        String empType = this.getClass().getName();
        return empType;
    }
    
}
