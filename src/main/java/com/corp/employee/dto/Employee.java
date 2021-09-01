package com.corp.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

	private String empId;
	private String name;
	private String dept;
	private String emailId;
	private float vacationDays = 0;
	private float workDays;
	private EmpType empType;
}
