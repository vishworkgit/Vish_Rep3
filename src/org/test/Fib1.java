package org.test;

public class Fib1 {
	
	static int i=0;
	static int j=1;
	static int k;
	int ct=7;
	public void fib() {
		
		
		System.out.println(i);
		if(ct>1) {
			
		k=i+j;
		i=j;
		j=k;

		--ct;
		fib();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		Fib1 fi=new Fib1();
		
		System.out.println("Fib Series : ");
		
		fi.fib();
		
		
	}
		

}
