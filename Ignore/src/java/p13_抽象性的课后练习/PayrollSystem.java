package src.java.p13_抽象性的课后练习;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前月份：");
        int month = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH));  //获取当前月份
        int month1 = calendar.get(Calendar.MONTH) + 1;

        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("马云",1002,new MyDate(1992,2,28),10000);
        employees[1] = new HourltEmployee("马化腾",2001,new MyDate(1991,5,6),50,240);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            System.out.println(employees[i].earnings());

            if (employees[i].getBirthday().getMonth() == month){
                System.out.println("生日快乐，奖励100元");
            }

        }



    }

}
