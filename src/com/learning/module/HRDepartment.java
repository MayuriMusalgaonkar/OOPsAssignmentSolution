package com.learning.module;

public class HRDepartment extends SuperDepartment {

	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	public String doActivity() {
		return "team Lunch";
	}
	
	/*
	 * @Override public String toString() { return "Welcome to " + departmentName()
	 * + "\r\n" +doActivity()+"\r\n" + getTodaysWork()+ "\r\n" + getWorkDeadline() +
	 * "\r\n" + isTodayAHoliday() ; }
	 */
}
