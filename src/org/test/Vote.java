package org.test;
import java.util.*;

public class Vote {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter your age :");
		Scanner sc =new Scanner(System.in);
		byte age= sc.nextByte();
		
		if(age < 18) {
			System.out.println("Age is "+age+" Not Eligible for voting");
			
		}
		else {
			System.out.println("Age is "+age +" Eligible for voting");
		}
		
		
		
	}

}
