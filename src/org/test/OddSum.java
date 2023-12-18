package org.test;

public class OddSum {
	public static void main(String[] args) {
		int j=0;
		for(int i=1;i<=100;i++) {
			
			if((i%2)!=0) {
				
				j=i+j;

			}
		}
		System.out.println("Output = "+j);

	}
	

}
