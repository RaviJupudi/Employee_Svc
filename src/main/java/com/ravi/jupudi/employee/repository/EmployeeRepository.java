package com.ravi.jupudi.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravi.jupudi.employee.model.Employee;
/**
 * 
 * @author Ravi Jupudi
 *
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
