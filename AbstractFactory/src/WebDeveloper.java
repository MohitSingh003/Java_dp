public class WebDeveloper implements Employee {
    
    public int getSalary(){
        System.out.println("Getting salary fro Web Developer");
        return 40000;
    }

    
    public String getEmployeeType() {
        String empType = this.getClass().getName();
        return empType;
    }

    
}
