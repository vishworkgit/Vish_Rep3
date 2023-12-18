package org.task;

public class Arr4D {
	
	public static void main(String[] args) {
		
		int a[][][][]=new int [2][2][2][2];
		
		a[0][0][0][0]=10;
		a[0][0][0][1]=20;
		a[0][0][1][0]=30;
		a[0][0][1][1]=40;
		a[0][1][0][0]=50;
		a[0][1][0][1]=60;
		a[0][1][1][0]=70;
		a[0][1][1][1]=80;

		a[1][0][0][0]=90;
		a[1][0][0][1]=100;
		a[1][0][1][0]=110;
		a[1][0][1][1]=120;
		a[1][1][0][0]=130;
		a[1][1][0][1]=140;
		a[1][1][1][0]=150;
		a[1][1][1][1]=160;
		
		System.out.println("For Loop 4D");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					for(int l=0;l<a.length;l++) {
					System.out.print(a[i][j][k][l]+" ");
					}System.out.println();
				}System.out.println();
			}System.out.println();
		}
		
		System.out.println("For Each Loop 4D");

		for(int is[][][] : a) {
			for(int is1[][] : is) {
				for(int is2[] : is1) {
					for(int is3 : is2) {
						System.out.println(is3);
					}
				}
				
			}
		}
	}

}
