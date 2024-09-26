package com.accessmodifier;

public class Maxspeed {
	int Maxspeed=60;
	

	public static void main(String[] args) {
        Maxspeed mm=new Maxspeed();
        mm.speed();
        
	}
	void speed() {
		int Maxspeed=90;
		System.out.println("My max speed is "+Maxspeed);
		System.out.println(" My speed is "+this.Maxspeed);
	}

}
