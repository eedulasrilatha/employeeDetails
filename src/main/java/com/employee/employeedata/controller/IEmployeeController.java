package com.employee.employeedata.controller;

import com.employee.employeedata.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public interface IEmployeeController {
    ResponseEntity<List<Employee>> updateEmployee(@PathVariable("place") String place, @PathVariable ("percentage") int percentage);

     ResponseEntity<Map<String, Object>> getEmployeesByPlace(@PathVariable("place") String place,
                                                                   @RequestParam(defaultValue = "5") int size,
                                                                   @RequestParam(defaultValue = "0") int page);

    ResponseEntity<Object> retrieveRangeOfSalariesBasedOnCompetency(@PathVariable("competency") int competency);
}
