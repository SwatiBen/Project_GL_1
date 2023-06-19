package com.ben.departmentsPackage;

import com.ben.superDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	// OverRidding ParentMethod
	public String departmentName() {
		return "Admin Department";
	}

	// OverRidding ParentMethod
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	// OverRidding ParentMethod
	public String getWorkDeadline() {
		return "Complete By EOD";
	}

}
