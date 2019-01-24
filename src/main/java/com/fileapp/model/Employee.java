package com.fileapp.model;

public class Employee {

	private int eid;
	private String ename;
	private String esalary;
	private String phoneNo;
	public Employee() {
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsalary() {
		return esalary;
	}
	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Employee(int eid, String ename, String esalary, String phoneNo) {
		
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
