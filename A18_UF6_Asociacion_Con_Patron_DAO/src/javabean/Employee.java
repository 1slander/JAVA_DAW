package javabean;

import java.time.LocalDate;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of="employeeId")

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate hireDate;
	private Job job;
	private double salary;
	private double commissionPct;
	//private Employee myBoss;
	private Department deparment;
	
	

}
