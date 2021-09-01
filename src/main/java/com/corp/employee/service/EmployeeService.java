package com.corp.employee.service;

import org.springframework.stereotype.Service;

import com.corp.employee.repository.EmployeeRepository;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Data
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public void addWork(String empId, int numWorkDays) {
		log.info("Update Work");
		employeeRepository.addWorkDay(empId, numWorkDays);
	}

	public void takeVacation(String empId, float numVacDays) {
		log.info("Update Vacation");
		employeeRepository.addVacationDays(empId, numVacDays);
	}
}
