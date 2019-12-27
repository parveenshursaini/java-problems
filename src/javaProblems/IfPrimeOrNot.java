package javaProblems;

import java.util.Scanner;

public class IfPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a no. to check if prime or not ?");
		int n=scan.nextInt();
		 
		int temp=0;
		
		for(int i=2; i<n;i++) {
			
			if(n%i==0) {
				temp=temp+1;
			}
		}
			if(temp>0) {
				System.out.println("entered no. is not a prime");
			}
			else {
				System.out.println("entered no. is a prime");
			}
	
	}

}
