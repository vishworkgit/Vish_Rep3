package org.task;

import java.util.*;
/*import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;*/
import java.util.Map.*;

public class MapClas {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> mp = new Hashtable<>();
		
		mp.put(100, "Phil");
		mp.put(100, "Jack");
		mp.put(300, "Roy");
		mp.put(400, "Mike");
		mp.put(500, "Alex");
		mp.put(600, "End");
		
		System.out.println("Without Entry Set "+mp);
		
		Set<Entry<Integer, String>> enst= mp.entrySet();
		
		System.out.println("With Entry Set "+enst);
		
		System.out.println("For Each of Entryset");
		
		for(Entry<Integer, String> entset : enst){
			
			System.out.println(entset);
			System.out.println(entset.getKey());

			System.out.println(entset.getValue());
		}
		
	}
	
}
