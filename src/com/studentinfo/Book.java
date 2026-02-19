package com.studentinfo;

public class Book {
	int bookId;
	String title;
	String author;
	double price;
	double dis=10;
	
	public Book(int bookId,String title,String author,double price) {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	
	public String toString() {
		return "Bookid :" + bookId + " title :" + title + " author: " + author + " price :" + price;
	}


	void DiscountPer() {
		double res=0;
		res=((price-(price)*dis/100));
		System.out.println("The Final Amount After Discount :"+res);		
		
	}
	public static void main(String args[]) {
		Book b1=new Book(123,"The Hide & Seek","karthik1",2000);
		System.out.println(b1);
		b1.DiscountPer();
		Book b2=new Book(123,"Dare If U Can","Charan",1000);
		System.out.println(b2);
		b2.DiscountPer();
		
		
	}
	

}
