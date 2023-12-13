public class WebDeveloperFactory implements EmployeeAbstractFactory {

    @Override
    public Employee creatEmployee() {
        return new WebDeveloper();
    }
    
}
