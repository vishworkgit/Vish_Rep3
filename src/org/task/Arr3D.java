package org.task;

import java.util.Scanner;

public class Arr3D {
	
	public static void main(String[] args) {
		int a[][][]=new int [2][2][2];
		
		a[0][0][0]=10;
		a[0][0][1]=20;
		a[0][1][0]=30;
		a[0][1][1]=40;
		a[1][0][0]=50;
		a[1][0][1]=60;
		a[1][1][0]=70;
		a[1][1][1]=80;
		
		System.out.println("For Loop 3D");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					System.out.print(a[i][j][k]+" ");
				}System.out.println();
			}System.out.println();
		}
		
		System.out.println("For Each Loop 3D");
		for (int is[][]:a) {
			for(int is1[]:is) {
				for(int is2:is1) {
					System.out.print(is2+" ");
				}
				
			}
		}
		
		
	}

}
