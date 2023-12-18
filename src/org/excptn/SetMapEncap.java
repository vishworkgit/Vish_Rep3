package org.excptn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetMapEncap {

	public static void main(String[] args) {
		
		Encap en=new Encap();
		Encap en1 = new Encap();
		Encap en2=new Encap();
		Encap en3 = new Encap();
		
		en.setNum(1);
		en.setName("Josh");
		en1.setNum(2);
		en1.setName("Raj");
		en2.setNum(3);
		en2.setName("Kenny");
		en3.setNum(4);
		en3.setName("Rose");
		
//      Using Set Collections  To Get Encapsulation	
		
		Set<Encap> s =new HashSet<Encap>();
		
		s.add(en);
		s.add(en1);
		s.add(en2);
		s.add(en3);
		
//      For each only way for set because its value based(no get method for set)	
		
		for(Encap setvalue : s) {
			
			int num = setvalue.getNum();
			String name = setvalue.getName();
			System.out.println(num+" inside set "+name);
			
		}
	
//      Using Map Collection to Get Encapsulation
		
		Map<Object,Encap> mapvalues = new HashMap<>();
		
		mapvalues.put(1, en);
		mapvalues.put(2, en1);
		mapvalues.put(3, en2);
		mapvalues.put(4, en3);
		
		Set<Entry<Object,Encap>> entryset = mapvalues.entrySet();
		
		for(Entry<Object, Encap> forentry : entryset) {
			
			Encap value = forentry.getValue();
			int num = value.getNum();
			String name = value.getName();
			System.out.println(num+" Inside Map "+name);
			
		}
		
		
		
	}
}
