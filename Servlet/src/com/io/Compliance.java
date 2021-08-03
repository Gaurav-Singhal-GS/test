package com.io;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Compliance {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ComplianceID")
	private int compId;
	
	private String rlType;
	private String details;
	private String createDate;
	@Column(name = "department_id")
	private Department dept;

	public Compliance(String rlType, String details, String createDate, Department dept) {
		super();
		this.rlType = rlType;
		this.details = details;
		this.createDate = createDate;
		this.dept = dept;
	}



	public int getCompId() {
		return compId;
	}

	

	public String getRlType() {
		return rlType;
	}

	public void setRlType(String rlType) {
		this.rlType = rlType;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}



	@Override
	public String toString() {
		return "Compliance [compId=" + compId + ", rlType=" + rlType + ", details=" + details + ", createDate="
				+ createDate + ", dept=" + dept + "]";
	}

	
}
