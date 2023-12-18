package org.task;

public class Even1 {
	public static void main(String[] args) {
		System.out.println("The Even Numbers Between 0 to 10");

		for(int i=10;i>=0;i--) {
			
			switch (i%2) {
			case 0:
				System.out.println(i);
				break;

			}
		}
		
		
	}


}
