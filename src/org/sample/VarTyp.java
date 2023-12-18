package org.sample;

public class VarTyp {

	public static int ag=23;  //  Instance Variable
	public void add() {
		int a=10;       //  Local Variable
		System.out.println(a+" is Local Variable");
		
	}

	public static void main(String[] args) {
		VarTyp v=new VarTyp();
		System.out.println(v.ag+" is instance variable");
		v.add();
	}

}
