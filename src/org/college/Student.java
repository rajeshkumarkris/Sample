package org.college;

public class Student extends Hostel {
	public void studentName () {
		System.out.println("Student Name - Rajesh Kumar");
		}
		public void studentId () {
		System.out.println("Student Id : C704195");
		}
		public void studentDept () {
		System.out.println("Department : MBA");
		}
	public static void main (String [] args) {
		Student stu = new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		stu.deptName();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.hostelName();
	}
}
