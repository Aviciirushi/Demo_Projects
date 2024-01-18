package cpy.jsp.employee.model;

import java.util.Comparator;


public class SortByDesignation implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo (o2.getName());
	}
	

}