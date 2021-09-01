package com.corp.employee.repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.corp.employee.dto.EmpType;
import com.corp.employee.dto.Employee;
import com.corp.employee.exception.InvalidDaysException;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EmployeeRepository {

	public static final Map<String, Employee> EMPLOYEES = new ConcurrentHashMap<>();

	private static final int MANAGERMAXVACATION = 30;
	private static final int SALARIEDMAXVACATION = 15;
	private static final int HOURLYMAXVACATION = 10;

	private static final int MAXWORKDAYS = 260;

	public boolean addVacationDays(@NonNull final String empId, final float numVacDays) {

		if (EMPLOYEES.get(empId) == null) {
			return false;
		}

		Employee employee = EMPLOYEES.get(empId);
		float newVacDays = employee.getVacationDays() + numVacDays;

		EmpType empType = employee.getEmpType();

		int maxVacDays = getMaxvacationDays(empType);

		if (newVacDays > maxVacDays) {
			throw new InvalidDaysException(
					String.format("Cannot take more vacation than is available -  %d", maxVacDays));
		} else {
			employee.setVacationDays(newVacDays);
			EMPLOYEES.put(empId, employee);
			log.info("Employee Details : {} ", EMPLOYEES.get(empId).getVacationDays());
			return true;
		}
	}

	private int getMaxvacationDays(@NonNull final EmpType empType) {
		switch (empType) {
		case HOURLY:
			return HOURLYMAXVACATION;
		case MANAGER:
			return MANAGERMAXVACATION;
		case SALARIED:
			return SALARIEDMAXVACATION;
		default:
			return HOURLYMAXVACATION;
		}
	}

	public boolean addWorkDay(@NonNull final String empId, final int numWorkDays) {

		if (EMPLOYEES.get(empId) == null) {
			return false;
		}

		Employee employee = EMPLOYEES.get(empId);
		float newWorkDays = employee.getWorkDays() + numWorkDays;

		if (newWorkDays > MAXWORKDAYS) {
			throw new InvalidDaysException(String.format("Cannot work more than the max work day -  %d", MAXWORKDAYS));
		} else {
			employee.setWorkDays(newWorkDays);
			EMPLOYEES.put(empId, employee);
			log.info("Employee Details : {}", EMPLOYEES.get(empId).getWorkDays());
			return true;
		}
	}
}
