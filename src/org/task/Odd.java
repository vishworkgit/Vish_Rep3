package org.task;

public class Odd {
	
	public static void main(String[] args) {
		System.out.println("The Odd Numbers Between 0 to 10");
		for(int i=10;i>=0;i--) {
			if((i%2)==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
