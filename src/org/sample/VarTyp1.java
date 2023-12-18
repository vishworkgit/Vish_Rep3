package org.sample;

public class VarTyp1 extends VarTyp {


	public static String name="John"; // Static Variable
	public int age = 23;              // Instance Variable
	
	public void doad() {
		int ad =12;
		
		System.out.println(ad);
	}
	
	public static void main(String[] args) {
		
		
		VarTyp1 v1=new VarTyp1();
		System.out.println(v1.name+" is Static, Instance is "+v1.age);
		
	}
	

}
