package com.rideaki.employeesh2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rideaki.employeesh2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
