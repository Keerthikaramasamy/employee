package com.corp.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corp.employee.service.EmployeeService;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PutMapping("/work/{empId}/{numWorkDays}")
	public ResponseEntity<Boolean> updateWork(@PathVariable @NonNull String empId, @PathVariable int numWorkDays) {
		log.info("Update Work of employee with ID : {}",empId);
		employeeService.addWork(empId, numWorkDays);
		return ResponseEntity.ok(true);
	}

	@PutMapping("/vacation/{empId}/{numVacDays}")
	public ResponseEntity<Boolean> updateVacation(@PathVariable @NonNull String empId, @PathVariable float numVacDays) {
		log.info("Update Vacation of employee with ID : {}",empId);
		employeeService.takeVacation(empId, numVacDays);
		return ResponseEntity.ok(true);
	}

}
