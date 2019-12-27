package javaProblems;

import java.util.Scanner;

public class IsaPrimeOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter input");
		int n=scan.nextInt();
		int temp=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				temp=temp+1;
			}
			}if (temp>0){
				System.out.println(n+" not prime");
				
			}else {
				System.out.println(n+" is prime");
				
			}
		}
	}


