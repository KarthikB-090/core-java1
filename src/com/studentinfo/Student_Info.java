package com.studentinfo;

public class Student_Info {
	 String st_name;
	 int st_id;
	 int st_age;
	 char gender;
	 int st_sub1;
	 int st_sub2;
	 int st_sub3;
	
	public  void show() {
		System.out.println("Student Name : "+st_name +" Student Id : "+st_id +" Student Age : "+st_age +" Student gender: "+ gender
				+" Subject 1 :"+st_sub1+" Subject 2 :"+st_sub2+" Subject 3:"+st_sub3);
		}
	public  int Sum() {
		int sum=0;
		sum=st_sub1+st_sub2+st_sub3;
		return sum;
	}
	public  int Avg() {
		int avg=0;
		avg=(st_sub1+st_sub2+st_sub3)/3;
		return avg;
	}
	public static void main(String args[]) {
		Student_Info s1=new Student_Info();
		s1.st_name="Karthik";
		s1.st_id=123;
		s1.st_age=21;
		s1.gender='M';
		s1.st_sub1=40;
		s1.st_sub2=35;
		s1.st_sub3=45;
		s1.show();
		System.out.println(s1.Sum());
		System.out.println(s1.Avg());
		
		Student_Info s2=new Student_Info();
		s2.st_name="Charan";
		s2.st_id=389;
		s2.st_age=99;
		s2.gender='M';
		s2.st_sub1=45;
		s2.st_sub2=45;
		s2.st_sub3=45;
		s2.show();
		System.out.println(s2.Sum());
		System.out.println(s2.Avg());
	}
	

}
