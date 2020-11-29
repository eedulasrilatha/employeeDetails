package com.employee.employeedata.service;

import com.employee.employeedata.model.Employee;
import com.employee.employeedata.model.Range;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
List<Employee> updateEmpolyeeRecord(String place,int percentage);
Map<String,Object> fetchEmployeesByPlace(String place, int size, int page);
Range retrieveRangeOfSalariesBasedOnCompetency(int competency);
}
