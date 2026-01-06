package com.nirman.classwork;

public class Employe_details {
	String name;
	int emp_id;
	String Dept;
	int salary;
	String addrs;


public static void main(String[]args) {
	Employe_details emp=new Employe_details();
	
	emp.name="rishitha_janjirala";
	emp.emp_id=407;
	emp.Dept="ECE";
	emp.salary=80000;
	emp.addrs="chandanagar";
	System.out.println("emp_name: "+emp.name);
	System.out.println("emp_id: "+emp.emp_id);
	System.out.println("emp_dept: "+emp.Dept);
	System.out.println("emp_salary: "+emp.salary);
	System.out.println("emp_addrs: "+emp.addrs);
}
}