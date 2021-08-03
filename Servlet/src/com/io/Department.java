package com.io;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department_id")
	private int id;
	
	@Column(name = "department_name")
	private String name;

	/*Constructors*/
	public Department() {}
	
	public Department(String name) {
		super();
		this.name = name;
	}
	
	/*toString Method*/
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	/*Getter Setter Functions*/
	public int getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
