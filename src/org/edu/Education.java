package org.edu;

public class Education extends Arts{
public void arts () {
	System.out.println("Courses Offered in Arts:");
}
public void Science () {
	System.out.println("Courses Offered in Science:");
}
public static void main (String[]args) {
	Education edu = new Education ();
	edu.arts();
	edu.bA();
	edu.bBa();
	edu.bEd();
	edu.Science();
	edu.bSc();
	edu.bE();
	edu.bTech();
	edu.dental();
	edu.mbbs();
}
}
