package org.sample;
import java.util.*;

public class InputString {
	
	public void input1() {
		System.out.println("Enter the String1;");
	}
	public void input2() {
		System.out.println("Enter the String2;");
	}
	public void input3() {
		System.out.print("Enter the String3;");
	}
	
	public static void main(String[] args) {
		
		InputString i=new InputString();
		Scanner sc=new Scanner(System.in);
		
		i.input1();
		String s1=sc.nextLine();
		i.input2();
		String s2=sc.next();
		//sc.nextLine();
		i.input3();
		String s3=sc.nextLine();
		
		//System.out.println("The Strings are :"+s1+" " +s2+" "+s3 );
		System.out.println("The String is s1:"+s1);
		System.out.println("The String is s2"+s2);
		System.out.println("The String is s3:"+s3);
		
		
		
	}

}
