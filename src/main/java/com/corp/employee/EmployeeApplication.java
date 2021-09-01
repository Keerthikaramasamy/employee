package com.corp.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.corp.employee.dto.EmpType;
import com.corp.employee.dto.Employee;
import com.corp.employee.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			log.info("Creating employees on app startup..");
			Employee emp1 = Employee.builder().empId("1001").name("John").empType(EmpType.HOURLY).build();
			Employee emp2 = Employee.builder().empId("1002").name("Nick").empType(EmpType.HOURLY).build();
			Employee emp3 = Employee.builder().empId("1003").name("Greg").empType(EmpType.HOURLY).build();
			Employee emp4 = Employee.builder().empId("1004").name("Andy").empType(EmpType.HOURLY).build();
			Employee emp5 = Employee.builder().empId("1005").name("Ehren").empType(EmpType.HOURLY).build();
			Employee emp6 = Employee.builder().empId("1006").name("Kiran").empType(EmpType.HOURLY).build();
			Employee emp7 = Employee.builder().empId("1007").name("Korey").empType(EmpType.HOURLY).build();
			Employee emp8 = Employee.builder().empId("1008").name("Leela").empType(EmpType.HOURLY).build();
			Employee emp9 = Employee.builder().empId("1009").name("Robert").empType(EmpType.HOURLY).build();
			Employee emp10 = Employee.builder().empId("1010").name("Dan").empType(EmpType.HOURLY).build();
			Employee emp11 = Employee.builder().empId("1011").name("Caroline").empType(EmpType.SALARIED).build();
			Employee emp12 = Employee.builder().empId("1012").name("Lisa").empType(EmpType.SALARIED).build();
			Employee emp13 = Employee.builder().empId("1013").name("Mike").empType(EmpType.SALARIED).build();
			Employee emp14 = Employee.builder().empId("1014").name("Paul").empType(EmpType.SALARIED).build();
			Employee emp15 = Employee.builder().empId("1015").name("James").empType(EmpType.SALARIED).build();
			Employee emp16 = Employee.builder().empId("1016").name("Tina").empType(EmpType.SALARIED).build();
			Employee emp17 = Employee.builder().empId("1017").name("Kyle").empType(EmpType.SALARIED).build();
			Employee emp18 = Employee.builder().empId("1018").name("Richard").empType(EmpType.SALARIED).build();
			Employee emp19 = Employee.builder().empId("1019").name("Prat").empType(EmpType.SALARIED).build();
			Employee emp20 = Employee.builder().empId("1020").name("Jeff").empType(EmpType.SALARIED).build();
			Employee emp21 = Employee.builder().empId("1021").name("Jim").empType(EmpType.MANAGER).build();
			Employee emp22 = Employee.builder().empId("1022").name("Dylan").empType(EmpType.MANAGER).build();
			Employee emp23 = Employee.builder().empId("1023").name("Jonathan").empType(EmpType.MANAGER).build();
			Employee emp24 = Employee.builder().empId("1024").name("Thomas").empType(EmpType.MANAGER).build();
			Employee emp25 = Employee.builder().empId("1025").name("Ross").empType(EmpType.MANAGER).build();
			Employee emp26 = Employee.builder().empId("1026").name("Joe").empType(EmpType.MANAGER).build();
			Employee emp27 = Employee.builder().empId("1027").name("Ann").empType(EmpType.MANAGER).build();
			Employee emp28 = Employee.builder().empId("1028").name("Terry").empType(EmpType.MANAGER).build();
			Employee emp29 = Employee.builder().empId("1029").name("Jeremy").empType(EmpType.MANAGER).build();
			Employee emp30 = Employee.builder().empId("1030").name("Mark").empType(EmpType.MANAGER).build();

			String toLog = "Employee ID : {}, WorkDays : {}, VacationDays : {}";
			log.info(toLog, emp1.getEmpId(), emp1.getWorkDays(), emp1.getVacationDays());
			log.info(toLog, emp2.getEmpId(), emp2.getWorkDays(), emp2.getVacationDays());
			log.info(toLog, emp3.getEmpId(), emp3.getWorkDays(), emp3.getVacationDays());

			EmployeeRepository.EMPLOYEES.put(emp1.getEmpId(), emp1);
			EmployeeRepository.EMPLOYEES.put(emp2.getEmpId(), emp2);
			EmployeeRepository.EMPLOYEES.put(emp3.getEmpId(), emp3);
			EmployeeRepository.EMPLOYEES.put(emp4.getEmpId(), emp4);
			EmployeeRepository.EMPLOYEES.put(emp5.getEmpId(), emp5);
			EmployeeRepository.EMPLOYEES.put(emp6.getEmpId(), emp6);
			EmployeeRepository.EMPLOYEES.put(emp7.getEmpId(), emp7);
			EmployeeRepository.EMPLOYEES.put(emp8.getEmpId(), emp8);
			EmployeeRepository.EMPLOYEES.put(emp9.getEmpId(), emp9);
			EmployeeRepository.EMPLOYEES.put(emp10.getEmpId(), emp10);
			EmployeeRepository.EMPLOYEES.put(emp11.getEmpId(), emp11);
			EmployeeRepository.EMPLOYEES.put(emp12.getEmpId(), emp12);
			EmployeeRepository.EMPLOYEES.put(emp13.getEmpId(), emp13);
			EmployeeRepository.EMPLOYEES.put(emp14.getEmpId(), emp14);
			EmployeeRepository.EMPLOYEES.put(emp15.getEmpId(), emp15);
			EmployeeRepository.EMPLOYEES.put(emp16.getEmpId(), emp16);
			EmployeeRepository.EMPLOYEES.put(emp17.getEmpId(), emp17);
			EmployeeRepository.EMPLOYEES.put(emp18.getEmpId(), emp18);
			EmployeeRepository.EMPLOYEES.put(emp19.getEmpId(), emp19);
			EmployeeRepository.EMPLOYEES.put(emp20.getEmpId(), emp20);
			EmployeeRepository.EMPLOYEES.put(emp21.getEmpId(), emp21);
			EmployeeRepository.EMPLOYEES.put(emp22.getEmpId(), emp22);
			EmployeeRepository.EMPLOYEES.put(emp23.getEmpId(), emp23);
			EmployeeRepository.EMPLOYEES.put(emp24.getEmpId(), emp24);
			EmployeeRepository.EMPLOYEES.put(emp25.getEmpId(), emp25);
			EmployeeRepository.EMPLOYEES.put(emp26.getEmpId(), emp26);
			EmployeeRepository.EMPLOYEES.put(emp27.getEmpId(), emp27);
			EmployeeRepository.EMPLOYEES.put(emp28.getEmpId(), emp28);
			EmployeeRepository.EMPLOYEES.put(emp29.getEmpId(), emp29);
			EmployeeRepository.EMPLOYEES.put(emp30.getEmpId(), emp30);
			log.info("EMPLOYEES size : {}", EmployeeRepository.EMPLOYEES.size());
		};
	}
}
