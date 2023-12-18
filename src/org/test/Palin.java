package org.test;
import java.util.*;

public class Palin {
	static int sum=0,r=0;
	
	
	public int pal(int n) {
		if(n>0) {
			r=n%10;
			sum =(sum*10)+r;
			n=n/10;
			pal(n);
			
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Palin p=new Palin();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=sc.nextInt();
		int temp=n;
		p.pal(n);
		if(temp==sum) {
			
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

}
