package com.model;

import java.util.Objects;
import java.io.Serializable;
import java.sql.Date;

public class Employee implements Serializable{
	private int empid;
	private Date empDate;
	private String empName;
	private double empSalary;
	private String empEmail;
	private int empPhoneNumber;
	private String empPassword;
	
	public Employee(){
		
	}

	public Employee(int empid, Date empDate, String empName, double empSalary, String empEmail, int empPhoneNumber,
			String empPassword) {
		super();
		this.empid = empid;
		this.empDate = empDate;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empEmail = empEmail;
		this.empPhoneNumber = empPhoneNumber;
		this.empPassword = empPassword;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public Date getEmpDate() {
		return empDate;
	}

	public void setEmpDate(Date empDate) {
		this.empDate = empDate;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public int getEmpPhoneNumber() {
		return empPhoneNumber;
	}

	public void setEmpPhoneNumber(int empPhoneNumber) {
		this.empPhoneNumber = empPhoneNumber;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empDate=" + empDate + ", empName=" + empName + ", empSalary=" + empSalary
				+ ", empEmail=" + empEmail + ", empPhoneNumber=" + empPhoneNumber + ", empPassword=" + empPassword
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empDate, empEmail, empName, empPassword, empPhoneNumber, empSalary, empid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empDate, other.empDate) && Objects.equals(empEmail, other.empEmail)
				&& Objects.equals(empName, other.empName) && Objects.equals(empPassword, other.empPassword)
				&& empPhoneNumber == other.empPhoneNumber
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary)
				&& empid == other.empid;
	}

}
