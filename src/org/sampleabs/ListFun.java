package org.sampleabs;
import java.util.*;

public class ListFun {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add("Raja");
		l.add(1, 10);
		l.add("krish");
		l.add(3,40);
		l.add("Doc");
		l.set(3,50);
		l.add(5,50);
		l.set(5, "Jack");
		l.add(4,"hi");
		boolean b=l.contains("hi");
		int i= l.indexOf("krish");
		int s=l.size();
		
		System.out.println(l);
		System.out.println(b);
		System.out.println(i);
		System.out.println(s);
		
	}
	
}
