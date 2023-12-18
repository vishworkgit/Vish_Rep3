package org.task;

public class Arr2D {

	public static void main(String[] args) {
		
		int a[][]=new int [2][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		for(int is[] : a) {
			for(int is1 : is) {
				System.out.println(is1);
			}
		}
		
	}
}
