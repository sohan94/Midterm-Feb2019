package design;

public class EmployeeAbstract implements Employee{
    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

    void benefit()
    {
        System.out.println("There is not benefit in this company");
    }
}
