public class EmployeeFactory {
    
    public static Employee getEmployee(String employeeType){

        if(employeeType.trim().equalsIgnoreCase("android developer")){
            return new AndroidDev();
        }
        else if(employeeType.trim().equalsIgnoreCase("web developer")){
            return new WebDev();
        }
        else{
            return null;
        }
    }
}
