package com.studentinfo;

public class Temperature_Converter {
	static double cel=32;
	static double f=((cel*9/5)+32);
	
	void fahren() {
		System.out.printf("Fahren Heat: %.2f\n",f );
		
	}
	
	static void Celsius() {
		double res=((f-32)*5/9);
		System.out.printf("Celsius: %.2f\n", res);
	}
	public static void main(String args[]) {
		Temperature_Converter t1=new Temperature_Converter();
		t1.fahren();
		Celsius();
	}
	

}
