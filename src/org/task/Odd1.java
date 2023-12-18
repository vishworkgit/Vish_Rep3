package org.task;

import java.lang.invoke.SwitchPoint;

public class Odd1 {

	public static void main(String[] args) {
		System.out.println("The Odd Numbers Between 0 to 10");

		for(int i=0;i<=10;i++) {
			
			switch (i%2) {
			case 1:
				System.out.println(i);
				break;

			}
		}
		
		
	}
}
