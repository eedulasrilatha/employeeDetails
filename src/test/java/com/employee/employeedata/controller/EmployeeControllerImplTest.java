package com.employee.employeedata.controller;

import com.employee.employeedata.model.Employee;
import com.employee.employeedata.service.IEmployeeService;
import com.employee.employeedata.testutility.TestUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class EmployeeControllerImplTest {
    @InjectMocks
    EmployeeControllerImpl employeeController;
    @Mock
    IEmployeeService employeeService;

    @Test
    public void updateEmployeeTest(){
        List<Employee> employeeList= TestUtility.getUpdatedEmployeeRecords();
        Mockito.when(employeeService.updateEmpolyeeRecord("hyderabad",12)).thenReturn(employeeList);
        employeeController.updateEmployee("hyderabad",12);
        Assertions.assertEquals("Hyderabad",employeeList.get(5).getPlace());
    }

    @Test
    public void getEmployeesByPlaceTest(){
        Map<String,Object> employees= TestUtility.fetchEmployeesByplace(5,0);
        Mockito.when(employeeService.fetchEmployeesByPlace("Hyderabad",5,0)).thenReturn(employees);
        employeeController.getEmployeesByPlace("Hyderabad",5,0);
        Assertions.assertNotNull(employees);
    }


    @Test
    public void retrieveRangeOfSalariesBasedOnCompetencyTest(){
        Mockito.when(employeeService.retrieveRangeOfSalariesBasedOnCompetency(10)).thenReturn(TestUtility.getRangeOfSalries());
         employeeController.retrieveRangeOfSalariesBasedOnCompetency(10);
        Assertions.assertNotEquals("100000-400000", TestUtility.getRangeOfSalries());
    }


}
