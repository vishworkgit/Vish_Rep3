package org.excptn;
import java.util.*;

public class UsrDefHand {
	
	public static void main(String[] args) throws UserDefinExcp {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Water Bottle");

		System.out.println("0 : yes");

		System.out.println("1 : No");
		
		try {
		int choice=sc.nextInt();
		
		if(choice==0) {
			
			throw new UserDefinExcp();
			
		}
		else if (choice==1) {
			System.out.println("Please check other items too");
		}
		else {
			System.out.println("Enter 0 or 1 ");
		}
		
	}
	
	catch(UserDefinExcp e) {
		System.out.println(e.getMessage());
		
	}

}
}
