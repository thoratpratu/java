package com.accessmodifier;
// It is a special method
// It has no return type
// It always has same name as className
// It gets called automatically
// It can be with or without parameters

public class Constructor {
	Constructor(){
		System.out.println("I am a default constructor");
	}
	Constructor(int age){
		System.out.println("My age is "+age);
	}
	Constructor(String name,int age){
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}



	public static void main(String[] args) {
		Constructor cc= new Constructor(21);
		Constructor c1= new Constructor("pratiksha",21);
		Constructor c2= new Constructor();
           
	}

}
