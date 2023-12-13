public class AndroidDeveloperFactory implements EmployeeAbstractFactory {

    public Employee creatEmployee() {
        return new AndroidDeveloper();
    }
    
}
