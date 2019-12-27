package javaProblems;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int no=scan.nextInt();
		//armstrong no is if 153=1
		int n=no; //we use n=no to save the original value of no for comparison with arm later on
		int length=0;
		while(n!=0) 
		{    
			n=n/10;
			length=length+1;
			
		}
		//System.out.println(length);
		
		int m=no;
		int arm=0;
		int rem=0;
	
		
		while(m!=0) 
		{
			int mul=1;
			rem=m%10;
			for(int i=1;i<=length;i++) 
			{
				mul=mul*rem;	
			}
			arm=arm+mul;
			m=m/10;	
			//System.out.println(arm);
		}
		if(no==arm) {
			System.out.println(no+" is armserong");
		}
		
		else {
			System.out.println(no+" is not armserong");
		}
		
		
		
	}

}
