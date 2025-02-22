package javabean;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of="departmentid")

public class Department {

	
	private int departmentid;
	private String departmentName;
	private int manager;
	private Location location;
	
	
	
	

}
