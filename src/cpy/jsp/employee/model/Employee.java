package cpy.jsp.employee.model;

import java.time.LocalDateTime;

public class Employee {
	private int Eid;
	private String Name;
	private double Contact;
	private int Age;
	private String Designation;
	private LocalDateTime DOJ;

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getContact() {
		return Contact;
	}

	public void setContact(double contact) {
		Contact = contact;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public LocalDateTime getDOJ() {
		return DOJ;
	}

	public void setDOJ(LocalDateTime dOJ) {
		DOJ = dOJ;
	}

	public Employee(int eid, String name, double contact, int age, String designation, LocalDateTime dOJ) {
		super();
		Eid = eid;
		Name = name;
		Contact = contact;
		Age = age;
		Designation = designation;
		DOJ = dOJ;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
