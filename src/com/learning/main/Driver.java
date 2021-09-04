package com.learning.main;

import com.learning.module.AdminDepartment;
import com.learning.module.HRDepartment;
import com.learning.module.SuperDepartment;
import com.learning.module.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Object initialization
		SuperDepartment superDepartment=new SuperDepartment();
		SuperDepartment adminDepartment=new AdminDepartment();
		HRDepartment hrDepartment=new HRDepartment();
		TechDepartment techDepartment=new TechDepartment();
		
		
		System.out.println("Welcome to "+adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(superDepartment.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println("Welcome to "+hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(superDepartment.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println("Welcome to "+techDepartment.departmentName());		
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());		
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(superDepartment.isTodayAHoliday());
	}
	
	

}
