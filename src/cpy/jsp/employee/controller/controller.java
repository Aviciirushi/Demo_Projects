package cpy.jsp.employee.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cpy.jsp.employee.model.Employee;
import cpy.jsp.employee.model.SortByAge;
import cpy.jsp.employee.model.SortByDOJ;
import cpy.jsp.employee.model.SortById;
import cpy.jsp.employee.model.SortByName;
import cpy.jsp.employee.model.SortByContact;
import cpy.jsp.employee.model.SortByDesignation;

public class controller {

	private List<Employee> employees = new ArrayList<>();

	public Employee saveEmployee(Employee employee) {
		if (employee != null) {
			employees.add(employee);
			return employee;

		} else {
			return null;
		}
	}

	public boolean deleteEmployee(Employee employee) {

		if (employee != null) {
			return employees.remove(employee);
		} else {
			return false;
		}
	}

	public List<Employee> getAllEmployees() {
		return employees;
	}

	public Employee getEmployeeById(int eid) {

		for (Employee Employee : employees) {
			if (Employee.getEid() == eid) {
				return Employee;
			}
		}
		return null;
	}

	public void sortById() {
		Collections.sort(employees, new SortById());
	}

	public void sortByName() {
		Collections.sort(employees, new SortByName());
	}

	public void sortByContact() {
		Collections.sort(employees, new SortByContact());
	}

	public void sortByDOJ() {
		Collections.sort(employees, new SortByDOJ());
	}

	public void sortByAge() {
		Collections.sort(employees, new SortByAge());
	}

	public void SortByDesignation() {
		Collections.sort(employees, new SortByDesignation());
	}

	

}
