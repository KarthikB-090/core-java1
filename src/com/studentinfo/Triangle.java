package com.studentinfo;

public class Triangle {
	float base=5;
	float height=10;
	void AreaOFTriangle() {
		float res=0;
		System.out.println(base+" "+height);
		res=(float)(1/2.0*(base*height));
		System.out.println("Area Of The Triangle :"+res);
	}
	public static void main(String args[]) {
		Triangle t=new Triangle();
		t.AreaOFTriangle();
		
	}
	
	

}
