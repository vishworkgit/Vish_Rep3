package org.test;
import java.util.*;

public class Even {
	
	public void evn(int a) {
		
		if((a%2)==0) {
			
			System.out.println(a+" is Even");
			
		}
		else {
			System.out.println(a+" is Odd");
		}
		
		
	}
	
	public void ct( ) {
		int j=1;
		for(int i=1;i<=100;i++) {
			
			if((i%2)==0) {
				j++;
			}
		}
		System.out.println("Even numbers within 100 :"+j);
		
	}
	
	
	public static void main(String[] args) {
		
		Even e=new Even();
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Even E or Count C:");
		char c= sc.next().charAt(0);
		switch (c) {
		case 'E':
			System.out.println("enter number: ");
			int a= sc.nextInt();
			e.evn(a);
			break;
		case 'C':
			e.ct();
			break;
		}
		
		
	}

}
