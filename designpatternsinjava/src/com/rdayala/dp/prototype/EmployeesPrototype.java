package com.rdayala.dp.prototype;

import java.util.ArrayList;
import java.util.List;

// Prototype design pattern uses java cloning to copy the object

public class EmployeesPrototype {

	private List<String> empList;

	public EmployeesPrototype(){
		empList = new ArrayList<String>();
	}

	public EmployeesPrototype(List<String> list){
		this.empList=list;
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}

	public List<String> getEmpList() {
		return empList;
	}

	// the clone method is overridden to provide a 
	// deep copy of the employees list.
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new EmployeesPrototype(temp);
	}
}
