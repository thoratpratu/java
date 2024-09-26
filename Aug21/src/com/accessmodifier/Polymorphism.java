package com.accessmodifier;
// poly = many
// morph = forms
// method overloading = same name but different parameters
// method overriding = child having different implementation

public class Polymorphism {
	void add(int a,int b) {
		int c = a+b;
		System.out.println("The addition is "+c);
	}
	void add1(int a,int b,int c) {
		int d = a+b;
		System.out.println("The addition1 is "+d);
	}
	void add2(double a,double b) {
		double c = a+b;
		System.out.println("The Double addition is "+c);
	}

	public static void main(String[] args) {
		Polymorphism pp=new Polymorphism();
		pp.add(6, 6);
		pp.add1(4, 7, 9);
		pp.add2(8, 5);
		
       
	}

}
