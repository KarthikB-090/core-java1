package com.studentinfo;

public class Employee {
	int eId =123;
	String eName="Karthik";
	int Sal=45000;
	float bonus() {
		float res=(float)((Sal)+Sal*(20/100.0));
		return res;
	}
	public static void main(String args[]) {
		Employee e1=new Employee();
		System.out.println("Employee Id:"+e1.eId);
		System.out.println("Employee Name:"+e1.eName);
		System.out.println("Employee Salary:"+e1.Sal);
		System.out.println("Salary By Adding 20% Bonus:"+e1.bonus());
		
	}

}
