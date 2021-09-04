package com.learning.module;

public class TechDepartment extends SuperDepartment{

	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork () {
		return "Complete coding of Module 1";
	}
	public String getWorkDeadline () {
		return "Complete by EOD ";

	}
	public String getTechStackInformation () {
		return "Core Java";
	}
	
	/*
	 * @Override public String toString() { return "Welcome to " + departmentName()
	 * + "\r\n" + getTodaysWork()+ "\r\n" + getWorkDeadline() + "\r\n"
	 * +getTechStackInformation ()+ "\r\n" + isTodayAHoliday() ; }
	 */
}
