package com.first.aaa.model;

public class CustomerVIP {

	private String job;
	private String country;
	private String salary;
	
	public CustomerVIP(String name, String gender, String email, String birthYear
			, String job, String country, String salary) {
		super();
		// TODO Auto-generated constructor stub
		this.job = job;
		this.country = country;
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
