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
public class StatusReport {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="statusRptId")
	private int statusId;
	@OneToOne
	@Column(name="complianceId")
	private Compliance comp;
	@OneToOne
	@Column(name="empID")
	private Employee emp;
	private String comments;
	private String creatDate;
	@OneToOne
	@Column(name="department_Id")
	private Department dep;
	
	public StatusReport(Compliance comp, Employee emp, String comments, String creatDate, Department dep) {
		super();
		this.comp = comp;
		this.emp = emp;
		this.comments = comments;
		this.creatDate = creatDate;
		this.dep = dep;
	}

	public int getStatusId() {
		return statusId;
	}
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "StatusReport [statusId=" + statusId + ", comp=" + comp + ", emp=" + emp + ", comments=" + comments
				+ ", creatDate=" + creatDate + ", dep=" + dep + "]";
	}
	
	

}
