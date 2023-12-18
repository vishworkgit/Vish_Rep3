package or.constat;

import java.util.Scanner;

public class Number {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		int sum=0;
		
		System.out.println("Reverse Number");
		while(temp>0) {
			int temp1=temp%10;
			temp=temp/10;
			sum+=temp1;
			System.out.print(temp1);
			count++;
			
		}
		
		System.out.println("\nCount of Number\n"+count);
		System.out.println("The Sum of the Number\n"+sum);
		
	}

}
