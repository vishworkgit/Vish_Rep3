package or.constat;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int count=0,sum=0;
		
		
		while(temp>0) {
			count=count+1;
			temp=temp/10;
		}
		temp=num;
		while(temp>0) {
			int exp=temp%10;
			sum+=(Math.pow(exp, count));
			temp=temp/10;
			
			
		}
		
		if(num==sum) {
		
		System.out.println(num+" is Armstrong number");
		}
		else
		{
		System.out.println(num+" is not Armstrong number ");
		}
	}
}
