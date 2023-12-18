package org.sample;
import java.util.*;

public class Sample1  extends FirstProgram{
	
	

	public static void main(String[]  args) {
		
		String hs = " 20 30 40\n"+" 20 30 40 \n"+" 20 30 40\n";
		Scanner sc=new Scanner(hs);
		
		System.out.println("the string is s1->"+sc.next());
		System.out.println("the string is s2->"+sc.nextLine());
		System.out.println("the string is s3->"+sc.next());

		System.out.println("the string is s4->"+sc.next());
		sc.close();
		
		
		
	}
}
