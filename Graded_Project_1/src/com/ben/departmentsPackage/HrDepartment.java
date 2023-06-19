package com.ben.departmentsPackage;

import com.ben.superDepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	// OverRidding ParentMethod
	public String departmentName() {
		return "HR Department";
	}

	// OverRidding ParentMethod
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	// OverRidding ParentMethod
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}

}
