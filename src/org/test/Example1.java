package org.test;

public class Example1 {
	
	public void fLoop() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(i+"\t"+j);
			}
		}
	}
	
	public void fLoop2() {
		for(int i=1;i<=3;i++) {
			for(int j=i+1;j<=3;j++) {
				System.out.println(i+"\t"+j);
			}
		}
	}
	
	public void fLoop3() {
		for(int i=1;i<=3;i++) {
			for(int j=i+1;j<=i;j++) {
				System.out.println(i+"\t"+j);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Example1 e=new Example1();
		int i=5;
		
		if(i==5) {
			
			
			
		}
		
		e.fLoop();
		System.out.println("************");
		e.fLoop2();
		System.out.println("************");
		e.fLoop3();
	}

}
