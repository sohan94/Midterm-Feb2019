package design;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {

        System.out.println(EmployeeInfo.companyName);
        //Write Unit Test for all the methods has been implemented in this package.
        //Employee information
        EmployeeInfo Employee1 = new EmployeeInfo("Sohan",1);
        //Employee ID
        EmployeeInfo Employee = new EmployeeInfo(1);
        //Employee Bonus
        EmployeeInfo.calculateEmployeeBonus(2,100000,"Best Performance");
        //Employee pension
        double pension= EmployeeInfo.calculateEmployeePension(100000);
        System.out.println(pension);


    }
}
