package org.task;
import java.util.*;

public class Listli {
	
	public static void main(String[] args) {
		
		Set<Integer> l=new LinkedHashSet();
		
		l.add(202);
		l.add(10);
		l.add(101);
		l.add(3);
		l.add(0);
		l.add(0);
		l.add(5);
		System.out.println("Linked List: "+l);
		
		List l1 =new Vector();
		
		l1.add("Katrina");
		l1.add(20);
		l1.add(201);
		l1.add("Stop");
		l1.add("end");
		System.out.println("Vector:"+l1);
		
		Set<String> s1 = new TreeSet();
		s1.add("300");
		s1.add("30");
		s1.add("0");
		s1.add("301");
		//s1.add(33);
		//s1.add(35);

		System.out.println("Tree set "+s1);
		l1.addAll(s1);
		System.out.println("Tree Set Add Alls "+s1);
		
		l1.addAll(l);
		
		System.out.println("Add All: "+l1);
		
//		l1.retainAll(l);
//		System.out.println("Retain All: "+l1);
		
		
		
//		l1.removeAll(l);
//		System.out.println("Remove All: "+l1);
		
	}

}
