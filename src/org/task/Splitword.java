package org.task;

public class Splitword {
	
	public static void main(String[] args) {
		
		String s="Welcome to Java Class";
		String s1= s.substring(0, 8);
		 String[] sp = s1.split("");
		
		for(String s2 : sp) {
		System.out.println(s2);
		}
		
	}

}
