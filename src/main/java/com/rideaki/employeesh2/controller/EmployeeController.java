package com.rideaki.employeesh2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rideaki.employeesh2.dao.EmployeeRepository;
import com.rideaki.employeesh2.model.Employee;

@RestController
@RequestMapping({"/employees"})
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@GetMapping
	public List<Employee> findAll(){
		return repository.findAll();
	}

	@GetMapping(path = {"/{id}"})
	public Optional<Employee> findById(@PathVariable long id){
		return repository.findById(id);
	}

	@PostMapping
	public Employee create(@RequestBody Employee employee){
		return repository.save(employee);
	}

	@PutMapping
	public Employee update(@RequestBody Employee contact){
		return repository.save(contact);
	}	

	@DeleteMapping(path ={"/{id}"})
	public void delete(@PathVariable("id") long id) {
		repository.deleteById(id);
	}
}