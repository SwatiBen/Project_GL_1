package com.ben.driverPackage;

import com.ben.departmentsPackage.AdminDepartment;
import com.ben.departmentsPackage.HrDepartment;
import com.ben.departmentsPackage.TechDepartment;

public class Driver {
	public static void main(String[] args) {

		AdminDepartment adminObj = new AdminDepartment();
		System.out.println("Welcome to " + adminObj.departmentName() + "\n" + adminObj.getTodaysWork() + "\n"
				+ adminObj.getWorkDeadline() + "\n" + adminObj.isTodayAHoliday());
		System.out.printf("\n");

		HrDepartment hrObj = new HrDepartment();
		System.out.printf("Welcome to " + hrObj.departmentName() + "\n" + hrObj.doActivity() + "\n"
				+ hrObj.getTodaysWork() + "\n" + hrObj.getWorkDeadline() + "\n" + hrObj.isTodayAHoliday());
		System.out.printf("\n\n");

		TechDepartment techObj = new TechDepartment();
		System.out.printf("Welcome to " + techObj.departmentName() + "\n" + techObj.getTodaysWork() + "\n"
				+ techObj.getWorkDeadline() + "\n" + techObj.getTechStackInformation() + "\n"
				+ techObj.isTodayAHoliday());
	}
}
