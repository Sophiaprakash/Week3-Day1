package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Sophia");
	}
	
	public void studentDept() {
		System.out.println("ECE");
	}
	
	public void studentId() {
		System.out.println("EC23");
	}

	public static void main(String[] args) {
		
		Student x = new Student();
		x.collegeName();
		x.collegeCode();
		x.collegeRank();
		x.deptName();
		x.studentName();
		x.studentDept();
		x.studentId();
		
		

	}

}
