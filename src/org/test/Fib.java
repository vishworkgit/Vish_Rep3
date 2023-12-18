package org.test;

public class Fib {
	public static void main(String[] args ) {
		int n1=0,n2=1,n3=0,i,count=7;
		System.out.print(n1+" "+n2);
		for(i=1;i<=count-2;i++) {

			n3=n1+n2;

			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
			
			
		}
	}

}
