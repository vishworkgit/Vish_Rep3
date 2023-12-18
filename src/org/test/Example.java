package org.test;

public class Example {

	public void fLoop() {
		for (int i = 0; i <= 100; i++) {
			
			if(i==5) {
				System.out.println(i);
			}
			
		}
	}
	
	public void fLoop1() {
		for(int i=0;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}
	
	public void fLoop2() {
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
	}
	
	public void floop3() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+"\t"+j);
			}
		}
	}
	
	public static void main(String [] args) {
		
		Example e=new Example();
		
		e.fLoop();
		System.out.println("***************");
		e.fLoop1();
		System.out.println("***************");
		e.fLoop2();
		System.out.println("***************");
		e.floop3();
	}
}
