package org.test;

public class Fact {
	
	
	public static void main(String[] args) {
		
		Fact fa=new Fact();
		
		int f=7;
		int j=1;
		
		System.out.println("The factorial of "+f);
		
		for (int i = 1; i<=f; i++) {
			j=j*i;
			
			
		}
		System.out.println(j);
		
	}

}
