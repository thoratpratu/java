package com.accessmodifier;

public class Methodoverriding {
	void write() {
		System.out.println("I write normal english ");
	}


}
class Pratiksha extends Methodoverriding{
	//override
	void write() {
		System.out.println("I wirte cursive");
	}
	public static void main(String[] args) {
		Methodoverriding mm=new Methodoverriding();
		mm.write();
		
	}
}
