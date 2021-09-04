package com.learning.module;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	// below code create dependency 

	/*
	 * @Override public String toString() { return "Welcome to " + departmentName()
	 * + "\r\n" + getTodaysWork()+ "\r\n" + getWorkDeadline() + "\r\n" +
	 * isTodayAHoliday() ; }
	 */
	
}
