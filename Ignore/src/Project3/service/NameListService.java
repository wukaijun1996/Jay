package src.Project3.service;


import javafx.event.EventType;
import src.Project3.domain.*;

import static src.Project3.service.Data.*;

/**
 * 负责将Data中的数据封装到Employee[]数组中，同事提供相关操作Employees[]的方法
 */
public class NameListService {

    private Employee[] employees;

    /**
     * 给employee 及数组元素进行初始化
     */
    public NameListService() {

        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {

            //获取员工类型
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);

            //获取Employee的4个基本信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            double bonus;
            int stock;

            Equipment equipment;

            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT :
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }

        }


    }

    private Equipment createEquipment(int index) {

        int type = Integer.parseInt(EQUIPMENTS[index][0]);

        switch (type) {
            case PC://21
                return new PC(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
            case NOTEBOOK://22
                return new NoteBook(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
            case PRINTER://23
                return new Printer(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);

        }

        return null;
    }


    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmploytee(int id) throws TeamException {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id ){
                return employees[i];
            }
        }

        throw new TeamException("找不到指定的员工");
    }


}
