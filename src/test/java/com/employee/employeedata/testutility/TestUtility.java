package com.employee.employeedata.testutility;

import com.employee.employeedata.model.Employee;
import com.employee.employeedata.model.Range;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.*;
import java.util.function.Function;

public class TestUtility {

    public static List<Employee> getUpdatedEmployeeRecords()
    {
        List<Employee> employees=new ArrayList<>();

        Employee employee1=new Employee();
        employee1.setEmployeeId(1);
        employee1.setBusinessUnit("abcd");
        employee1.setEmployeeName("johny");
        employee1.setPlace("Hyderabad");
        employee1.setSalary(100000);
        employee1.setSupervisorId(01);
        employee1.setTitle("SE");
        employee1.setCompetency(10);

        Employee employee2=new Employee();
        employee2.setEmployeeId(2);
        employee2.setBusinessUnit("abc");
        employee2.setEmployeeName("johny2");
        employee2.setPlace("Hyderabad");
        employee2.setSalary(150000);
        employee2.setSupervisorId(02);
        employee2.setTitle("ASE");
        employee2.setCompetency(10);

        Employee employee3=new Employee();
        employee3.setEmployeeId(3);
        employee3.setBusinessUnit("abcd");
        employee3.setEmployeeName("sain");
        employee3.setPlace("Bangalore");
        employee3.setSalary(2000);
        employee3.setSupervisorId(01);
        employee3.setTitle("TL");
        employee3.setCompetency(20);

        Employee employee4=new Employee();
        employee4.setEmployeeId(4);
        employee4.setBusinessUnit("adc");
        employee4.setEmployeeName("hena");
        employee4.setPlace("chennai");
        employee4.setSalary(3000);
        employee4.setSupervisorId(02);
        employee4.setTitle("SE");
        employee4.setCompetency(10);

        Employee employee5=new Employee();
        employee5.setEmployeeId(5);
        employee5.setBusinessUnit("sdsx");
        employee5.setEmployeeName("george");
        employee5.setPlace("chennai");
        employee5.setSalary(3000);
        employee5.setSupervisorId(02);
        employee5.setTitle("SE");
        employee5.setCompetency(10);

        Employee employee6=new Employee();
        employee6.setEmployeeId(6);
        employee6.setBusinessUnit("wewe");
        employee6.setEmployeeName("king");
        employee6.setPlace("Hyderabad");
        employee6.setSalary(4000);
        employee6.setSupervisorId(04);
        employee6.setTitle("mng");
        employee6.setCompetency(20);

        Employee employee7=new Employee();
        employee7.setEmployeeId(7);
        employee7.setBusinessUnit("sds");
        employee7.setEmployeeName("ram");
        employee7.setPlace("Pune");
        employee7.setSalary(3500);
        employee7.setSupervisorId(04);
        employee7.setTitle("mng");
        employee7.setCompetency(20);

        Employee employee8=new Employee();
        employee8.setEmployeeId(8);
        employee8.setBusinessUnit("wewe");
        employee8.setEmployeeName("krishna");
        employee8.setPlace("Bangalore");
        employee8.setSalary(4000);
        employee8.setSupervisorId(04);
        employee8.setTitle("mng");
        employee8.setCompetency(20);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        return employees;
    }

    public static Map<String,Object> fetchEmployeesByplace(int size,int index)
    {
       Map<String,Object> paginationResponse = new HashMap<String, Object>();
        paginationResponse.put("employees", TestUtility.getUpdatedEmployeeRecords());
        paginationResponse.put("currentPage index", index);
        paginationResponse.put("totalItems", 3);
        paginationResponse.put("totalPages", size);
        return paginationResponse;
    }

    public static Range getRangeOfSalries()
    {
        Range range=new Range();
        range.setRange("10000-50000");
        return range;
    }


}
