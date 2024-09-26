package com.accessmodifier;

public class Mult {
	int num=20;
			

	public static void main(String[] args) {
		Mult mm= new Mult();
		mm.add(45); //argument
		mm.mult(5);
		

	}
	void add(int a) { //parameter
		int z=num+a;
		System.out.println("The Addition is "+z);
	}
	void mult(int b) {
		int d=num*b;
		System.out.println("The multiplication is "+d);
	}

}
