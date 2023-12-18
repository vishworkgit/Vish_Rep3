package org.sampleInherit;

public class Student1 extends BatchName {
	
	public void studName() {
		System.out.println("Student Name 1: Vikas");
		
	}
	
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.clName();
		s1.comName();
		s1.batchName();
		s1.studName();
	}

}
