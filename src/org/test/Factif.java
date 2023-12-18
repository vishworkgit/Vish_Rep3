package org.test;
import java.util.*;

public class Factif {
	static int j=1;
	static int i=1;
	
	public int ft(int k) {
		
		
		if(i<k) {
			j=k*(k-1)*j;
			--k;
			ft(k-1);
			}
		

		return j;
		
	}
	public static void main(String[] args) {
		
		Factif fa=new Factif();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter factorial number");
		int k=sc.nextInt();
		int e=fa.ft(k);
		System.out.println(" The Factorial of "+k+" is "+e);
		
	}

}
