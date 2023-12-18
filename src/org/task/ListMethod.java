package org.task;

import java.util.*;

public class ListMethod {
	

	static List l=new ArrayList();

	static int i=0;
	
	public void prili(int c) {

		if(c>=0) {
			Object o= l.get(c);
			System.out.println(o);
			c--;

			prili(c);
		}
	}
	
	public static void main(String[] args) {
		

		l.add("Mohan");
		l.add(20);
		l.add(true);
		l.add(94.5);
		l.add("Leo");
		l.add(20);
		
		
		int count=l.size();

		ListMethod li=new ListMethod();
		System.out.println("The List is "+l );
		System.out.println("");
		System.out.println("The Reverse List is");
		li.prili(count-1);
		
		
		
	}

}
