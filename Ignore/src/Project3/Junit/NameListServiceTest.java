package src.Project3.Junit;

import org.junit.Test;
import src.Project3.domain.Employee;
import src.Project3.service.NameListService;
import src.Project3.service.TeamException;

public class NameListServiceTest {

    @Test
    public void testGetAllEmployees() {
        NameListService nameListService = new NameListService();

        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }


    }

    @Test
    public void testGetEmployee() {
        NameListService nameListService = new NameListService();
        int id = 1;
        id = 110;
        try {

            Employee employee = nameListService.getEmploytee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }


}
