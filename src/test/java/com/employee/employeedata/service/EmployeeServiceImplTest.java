package com.employee.employeedata.service;

import com.employee.employeedata.model.Employee;
import com.employee.employeedata.repository.IEmployeeRepository;
import com.employee.employeedata.testutility.TestUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EmployeeServiceImplTest {

    @InjectMocks
    EmployeeServiceImpl employeeService;

    @Mock
    IEmployeeRepository employeeRepository;

    @Test
    public void updateEmpolyeeRecordTest()
    {
        Mockito.when(employeeRepository.findByPlace("Hyderabad")).thenReturn(TestUtility.getUpdatedEmployeeRecords());
        employeeService.updateEmpolyeeRecord("Hyderabad",12);
        Assertions.assertNotEquals("pune",TestUtility.getUpdatedEmployeeRecords().get(0).getPlace());
    }

   @Test
    public void retrieveRangeOfSalariesBasedOnCompetencyTest()
   {
       Mockito.when(employeeRepository.findByCompetency(10)).thenReturn("1000-4000");
      Object range= employeeService.retrieveRangeOfSalariesBasedOnCompetency(10);
       Assertions.assertNotEquals("1000-5000",range);
   }
}
