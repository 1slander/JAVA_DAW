package javabean;

import java.util.Objects;

public class Trabajo {
	
	private String jobId;
	private String jobTitle;
	private double minSalary;
	private double maxSalary;
	public Trabajo(String jobId, String jobTitle, double minSalary, double maxSalary) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
	public Trabajo() {
		super();
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}
	public double getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}
	@Override
	public String toString() {
		return "Trabajo [jobId=" + jobId + ", jobTitle=" + jobTitle + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(jobId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Trabajo))
			return false;
		Trabajo other = (Trabajo) obj;
		return Objects.equals(jobId, other.jobId);
	}
	
	
	

}
