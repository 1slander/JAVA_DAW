package javabean;

import java.util.Objects;

public class Department {
	
	private int departmentid;
	private String departmentName;
	private Employee manager;
	private Location location;
	
	public Department() {
		super();
	}
	public Department(int departmentid, String departmentName, Employee manager, Location location) {
		super();
		this.departmentid = departmentid;
		this.departmentName = departmentName;
		this.manager = manager;
		this.location = location;
	}
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentName=" + departmentName + ", manager="
				+ manager + ", location=" + location + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(departmentid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Department))
			return false;
		Department other = (Department) obj;
		return departmentid == other.departmentid;
	}
	
	

}
