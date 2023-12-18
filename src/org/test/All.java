package org.test;
import java.util.*;

public class All {
	public static void main(String[] args) {
		
		int a;
		
		System.out.println("Enter number:");
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println(a);
		
		switch(a) {
		case 1:
			Even e=new Even();
			e.main(args);
			break;
		case 2:
			OddSum o=new OddSum();
			o.main(args);
			break;
			
		default:
			System.out.println("no such prog");
			break;
		}
		
		
			
	}

}
