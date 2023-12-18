package org.sampleabs;

public class Car {
	
	public void speed() {
		int speed = 60;
		System.out.println("In the Class Car");
	}
	
	public static void main(String[] args) {
		
		Car c=new Car();
		c.speed();
		c = new Ford();
		c.speed();
		c = new BMW();
		c.speed();
	}

}

class Ford extends Car{
	
	public void speed() {
		int speed = 120;
		System.out.println("In the Class Ford");
	}
	
}

class BMW extends Car{
	public void speed() {
		int Speed = 140;
		System.out.println("In class BMW");
	}
}

