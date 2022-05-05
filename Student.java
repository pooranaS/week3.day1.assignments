package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("The student name is Poorna");
	}
	public void studentDept()
	{
		System.out.println("The student dept is EIE");
	}
	public void studentId()
	{
		System.out.println("the student id is 103");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println("Output of college class");
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		System.out.println("output of department class");
		s.deptName();
		System.out.println("output of student class");
		s.studentName();
		s.studentDept();
		s.studentId();
	}

}
