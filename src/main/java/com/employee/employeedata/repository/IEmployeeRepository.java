package com.employee.employeedata.repository;

import com.employee.employeedata.model.Employee;
import com.employee.employeedata.model.Range;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {


    List<Employee>findAll();

    List<Employee> findByPlace(String place);

    Page<Employee> findByPlace(String place, Pageable pageable);

    @Query(value = "select  min(SALARY)||'-'||max(SALARY) as range_SALARY  from employee where COMPETENCY=:competency",nativeQuery = true)
    String findByCompetency(int competency);
}
