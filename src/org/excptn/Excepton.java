package org.excptn;
import java.util.*;

public class Excepton {
	

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Excepton ex =new Excepton();
	
		
		try {
			
//          InputMismatch ->  when we enter String in the place of int variable.

			
			System.out.println("Enter the  Serial number : ");
			int number = sc.nextInt();
			System.out.println(number);
			
//           NumberFormat Exception -> when we enter number in the String variable	

			sc.nextLine();
			System.out.println("Enter the RollId : ");
			String roll = sc.nextLine();
			int rollid = Integer.parseInt(roll);
			System.out.println(roll);
			

		}
		catch(InputMismatchException e) {
			System.out.println("Print Only Number");

		}
		catch(NumberFormatException e) {
			System.out.println("Rollid with Strings cannot convert to int");
			}	

		
		

		
		
		

		
	}

}
