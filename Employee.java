package com.hello;

public class Employee {

	public void print(String name, int id) {
		System.out.println("Empname: "+name+" EmpId: "+id);
	
	}
	public void print(int id, int salary) {
		System.out.println("EmpId :"+id+"EmpSal : "+salary);
	}
	
	public void print(String name, String desg) {
		System.out.println("basic info of employee: "+name+" "+desg);
	
	}
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.print("vishal", 101);
		e1.print(101, 35000);
		e1.print("vishal", "software dev");
	}
}
