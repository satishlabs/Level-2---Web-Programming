package com.entity;

/**
 * @author satis
 *
 */
public class Employee {
	private int employeeId;
	private String employeeName;
	private String email;
	private String departmentName;
	
	/**
	 * @param employeeId
	 * @param employeeName
	 * @param email
	 * @param departmentName
	 */
	public Employee(int employeeId, String employeeName, String email, String departmentName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.departmentName = departmentName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
