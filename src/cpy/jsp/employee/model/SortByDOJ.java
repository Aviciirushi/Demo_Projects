package cpy.jsp.employee.model;

import java.util.Comparator;

public class SortByDOJ implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getDOJ().hashCode() - o2.getDOJ().hashCode();
	}
	

}