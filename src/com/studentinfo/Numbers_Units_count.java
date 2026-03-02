package com.studentinfo;

public class Numbers_Units_count {
	public static void main(String args[]) {
		int a=9829;
		int res=a%1000;
		int res1=res/100;
		int res2=a%100;
		System.out.println("The Number of Thousands : "+ a/1000);
		System.out.println("The Number Of Hundreds : "+res1%100);
		System.out.println("The Number Of Tens : "+res2/10);
		System.out.println("The Number Of Units : "+a%10);
		
		
		
		
		
	}

}
