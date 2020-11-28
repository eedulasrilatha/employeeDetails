package com.employee.employeedata.controller;

import com.employee.employeedata.exception.CustomizedException;
import com.employee.employeedata.model.Employee;
import com.employee.employeedata.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @PutMapping(value="/employee/place/{place}/salary/{percentage}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Employee>>updateEmployee(@PathVariable("place") String place,@PathVariable ("percentage") int percentage)
    {
        ResponseEntity<List<Employee>> responseEntity=null;
        List<Employee> employees= employeeService.updateEmpolyeeRecord(place, percentage);
        return   responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping(value="/getEmployeesByPlace/{place}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getEmployeesByPlace(@PathVariable("place") String place,
                                                                  @RequestParam(defaultValue = "5") int size,
                                                                  @RequestParam(defaultValue = "0") int page){
        ResponseEntity<Map<String, Object>> responseEntity=null;
        Map<String, Object> response = employeeService.fetchEmployeesByPlace(place, size, page);
        return responseEntity=new ResponseEntity<>(response,HttpStatus.OK);
    }

    @GetMapping(value="/fetchRangeOfSalariesForGivenCompetency/{competency}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> retrieveRangeOfSalariesBasedOnCompetency(@PathVariable("competency") int competency)
    {
            ResponseEntity<Object> responseEntity=null;
            Object rangeOfSalary= employeeService.retrieveRangeOfSalariesBasedOnCompetency(competency);
           return responseEntity= new ResponseEntity<>(rangeOfSalary,HttpStatus.OK);
    }
}
