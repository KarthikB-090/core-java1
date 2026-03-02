package com.bank_Lab_program;
import java.util.Scanner;
public class Bank {
	 int accNo;
	 String name;
	 double balance;
	 int pin;
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		Bank b1=new Bank();
		System.out.println("Enter The Acc Number :");
		b1.accNo=sc.nextInt();
		System.out.println("Enter the Account Holder Name :");
		b1.name=sc.next();
		System.out.println("Enter the Balance :");
		b1.balance=sc.nextDouble();
		System.out.println("Enter the Pin :");
		b1.pin=sc.nextInt();
		
		System.out.println("The Updated Amount :"+b1.addMoney(b1.balance));
		
		System.out.println("The Withdraw Amount :"+b1.withdraw(b1.balance));
		b1.checkbalance(b1.balance);
		System.out.println("The Changed Pin :"+b1.pincodeChange());
		
		
		sc.close();
	}
	 double addMoney(double amt ) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount To add");
		double add=sc.nextDouble();
		return add+amt;
	}
	 void checkbalance(double amt) {
		 System.out.println("The Balance in Your Account is: "+ amt);
		 
	 }
	 
	 double withdraw(double amt) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the amount To Withdraw");
		 double wtdr=sc.nextDouble();
		 return amt-wtdr;
		 
	 }
	 
	 int pincodeChange() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Pin To change:");
		 int pin=sc.nextInt();
		 return pin;
	 }
	
	
	

}
