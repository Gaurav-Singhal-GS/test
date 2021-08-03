package com.io;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "EmpID")
	private int empId;
	
	@Column(name = "firstName")
	private String fname;
	
	@Column(name = "lastName")
	private String lname;
	
	private String dob;
	private String email;
	
	@OneToOne
	private Department dep;
	
	
	/*Constructors*/
	public Employee() {}
	
	public Employee(String fname, String lname, String dob, String email, Department dep) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
		this.dep = dep;
	}
	
	/*toString Method*/
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", email="
				+ email + ", depID=" + dep + "]";
	}
	
	/*Setters and Getters*/
	public int getEmpId() {
		return empId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepID() {
		return dep;
	}

	public void setDepID(Department depID) {
		this.dep = depID;
	}


}
