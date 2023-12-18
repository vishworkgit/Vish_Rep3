package org.task;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

import org.omg.Messaging.SyncScopeHelper;

public class ListForEach {
	
	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add("ram");
		l.add(10);
		l.add(true);
		l.add(64.5);
		l.add("Leo");
		l.add(10);
		
		System.out.println("FOR LOOP");
		
		for(int i=l.size()-1;i>0;i--) {
			Object o = l.get(i);
			System.out.println(o);
		}
		
		System.out.println("********************");
		System.out.println("\nFOR EACH LOOP");
		
		for(Object s : l) {
			
			System.out.println(s);
			
		}
		
		System.out.println("\nFor Each different way");
		String n;
		l.forEach(i -> {System.out.println(i);});
		
	}

}
