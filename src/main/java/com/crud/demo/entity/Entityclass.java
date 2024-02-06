package com.crud.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Entityclass {
	private String name;
	private String schoolname;
	@Id
	private int rollno;
	public Entityclass(String name, String schoolname, int rollno) {
		super();
		this.name = name;
		this.schoolname = schoolname;
		this.rollno = rollno;
	}
	
	public Entityclass() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Entityclass [name=" + name + ", schoolname=" + schoolname + ", rollno=" + rollno + "]";
	}

	

}
