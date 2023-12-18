package org.excptn;
import java.util.*;

public class GtSt {

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
		
//		Normal GET Method
		
		int num= en.getNum();
		String name= en.getName();
		System.out.println(num+" Normal Get "+name);
		
//      Using the list to GET Value of Encapsulation
		
		List<Encap> listvalue = new ArrayList<Encap>();
		listvalue.add(en);
		listvalue.add(en1);
		listvalue.add(en2);
		listvalue.add(en3);
		
		

//		Using For Loop for Iteration
		
		for(int i=0;i<listvalue.size();i++) {
			Encap infor =listvalue.get(i);
			
			int numinfor = infor.getNum();
			String nameinfor = infor.getName();
			System.out.println(numinfor+" Inside For  "+nameinfor);
		}
		
		
//       Using For Each for iteration
		
		for(Encap listval : listvalue) {
			
			int num2 = listval.getNum();
			String name2 = listval.getName();
			System.out.println(num2+" inside for each "+name2);
			
		}
		
	}
}
