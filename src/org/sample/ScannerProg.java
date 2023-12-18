package org.sample;
import java.util.*;

public class ScannerProg {
	
	private void inp() {
		System.out.print("enter your age: " );
	
	}
	private void yn() {
		System.out.println("If you already voted type Y or else N :");
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ScannerProg s=new ScannerProg();
		s.inp();
		int age=sc.nextInt();
		System.out.println("The age is "+age);
		
		if(age>=18) {
			System.out.println("You are eligible for voting");
			
		}
		else {
			System.out.println("you are not eligible for voting");
			
		}
		
		s.yn();
		char c=sc.next().charAt(0);
		if(c=='y'||c=='Y') {
			System.out.println("Good job");
		}
		else if(c=='n'||c=='N') {
			System.out.println("Please vote");
			
		}
		else {
			System.out.println("wrong answer type Y Or N");
			
		}
	}

}
