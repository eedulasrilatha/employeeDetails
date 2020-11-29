package com.employee.employeedata.service;
import com.employee.employeedata.exception.CustomizedException;
import com.employee.employeedata.model.Employee;
import com.employee.employeedata.model.Range;
import com.employee.employeedata.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements IEmployeeService  {

    @Autowired
    private IEmployeeRepository repository;

    public List<Employee> updateEmpolyeeRecord(String place,int percentage)
    {
        List<Employee> updatedEmployeeRecords=null;
        if(place!=null && (percentage!=0 && percentage<=55))
        {
            List<Employee> employees = repository.findByPlace(place);
            if (employees != null && !employees.isEmpty()) {
                employees.stream().forEach(employee -> {
                    employee.setSalary(calculatePercentage(employee.getSalary(), percentage));
                    System.out.println("individual employee###" + employee);
                });
            }
            else{
                throw new CustomizedException("unable to update the record due to invalid data ### place::"+place+"##invalid percentage "+percentage);
            }
            updatedEmployeeRecords= repository.saveAll(employees);
        }
    else{
            throw new CustomizedException("no input value for  place::"+place+"##invalid percentage "+percentage);
    }
    return updatedEmployeeRecords;

    }

    public Map<String,Object> fetchEmployeesByPlace(String place,int size,int page)
    {
        Page<Employee> pageOfEmployees;
        Pageable paging = PageRequest.of(page, size);
        Map<String, Object> paginationResponse=null;
        pageOfEmployees= repository.findByPlace(place,paging);
        if(pageOfEmployees!=null && !pageOfEmployees.isEmpty()) {
            List<Employee> employeeList = pageOfEmployees.getContent();
            paginationResponse = new HashMap<String, Object>();
            paginationResponse.put("employees", employeeList);
            paginationResponse.put("currentPage index", pageOfEmployees.getNumber());
            paginationResponse.put("totalItems", pageOfEmployees.getTotalElements());
            paginationResponse.put("totalPages", pageOfEmployees.getTotalPages());
        }else{
            throw new CustomizedException("no records available for the provided data #### Place:::"+place +
                    "size##"+size+"page###"+page);
        }
        return paginationResponse;
    }
public Range retrieveRangeOfSalariesBasedOnCompetency(int competency)
{
  String salaryRange=repository.findByCompetency(competency);
  if(salaryRange!=null) {
      Range range = new Range();
      range.setRange(salaryRange);
      return range;
  }
  else
      throw new CustomizedException("unable to retrieve the salary range for provided competency ###"+competency);
}


    int calculatePercentage(int salary,int percentage)
    {
        return (salary*percentage/100)+ salary;
    }
}
