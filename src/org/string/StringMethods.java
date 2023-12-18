package org.string;

public class StringMethods {
	


	public static void main(String[] args) {
		
		String s1="Winner Winner Chicken",s2="Dinner",s3="Winner",s4=s1.concat("   ");
		
		int i=s1.length();
		System.out.println(i+" Length");
		
		System.out.println(s1.toUpperCase()+" To UpperCase");
		
		System.out.println(s1.toLowerCase()+" To LowerCase");
		
		System.out.println(s1.concat(s2)+" Concatenated");
		
		System.out.println(s1.equals(s3)+" Equals");
		
		System.out.println(s1.equalsIgnoreCase(s4)+" Equals Ignore Case");
		
		System.out.println(s1.contains(s3)+" Contains");
		
		System.out.println(s1.replace(s3,s2)+" Replace");
		
		System.out.println(s1.indexOf('e')+" Start Index of Char");
		
		System.out.println(s1.lastIndexOf('e')+" Last Index of Char");
		
		System.out.println(s4+" after trim "+s4.trim());
		
		System.out.println(s1.charAt(3)+" Char At");
		
		System.out.println(s1.startsWith(s3)+ " Starts With");
		
		System.out.println(s1.endsWith("Chicken")+" Ends With");
		
		System.out.println(s1.isEmpty()+ " is Empty");
	}

}
