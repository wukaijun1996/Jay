package src.java.p12_抽象性的练习;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee manager = new Manager("库克",1001,500,5000000);
        manager.work();
        System.out.println(manager.xx);

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();


    }

}
