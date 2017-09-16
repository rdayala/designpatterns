package com.rdayala.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class ClientCodeTestPrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		EmployeesPrototype emps = new EmployeesPrototype();
		emps.loadData();
		List<String> list = emps.getEmpList();

		// Use the clone method to get the Employee object
		// prototype objects
		EmployeesPrototype empsNew = (EmployeesPrototype) emps.clone();
		EmployeesPrototype empsNew1 = (EmployeesPrototype) emps.clone();	
		 
		List<String> list1 = empsNew.getEmpList();
		list1.add("John");
		
		List<String> list2 = empsNew1.getEmpList();
		list2.remove("Pankaj");

		System.out.println("emps List : " + emps.getEmpList());
		System.out.println("emps List1: " + empsNew.getEmpList());
		System.out.println("emps List2: " + empsNew1.getEmpList());
	}

}
