package org.interprog;

public class StarPattern {
	
	public static void main(String[] args) {
		
		
//	Star pattern Square
//		* * *
//		* * * 
//		* * *
		
		int n=3;
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		Star Pattern Left Angled Increasing
//		* 
//		* *
//		* * *
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		Star Pattern Left Angled decreasing
//		* * *
//		* *
//		* 
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		Star Pattern Right Angled increasing
//		    *
//		  * *
//		* * *
		for(int i=1 ;i<=n ;i++ ) {
			for(int s=n;s>i;s--) {
				System.out.print("  "); // Double Space for Right Triangle
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

//		Star Pattern Right Angled decreasing
//	   * *  *
//		  * *
//		    *
		for(int i=n ;i>=1 ;i-- ) {
			for(int s=3;s>i;s--) {
				System.out.print("  ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//	 Star Pattern upward Pyramid
//	    *
//	   * *
//	  * * *
	for(int i=1 ;i<=n ;i++ ) {
		for(int s=n;s>i;s--) {
			System.out.print(" "); // Single Space for Pyramid
			
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}

//	Star Pattern Lower Pyramid
//   *  *  *
//	  *  *
//	    *
	for(int i=n ;i>=1 ;i-- ) {
		for(int s=3;s>i;s--) {
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
		
	}
	
}
