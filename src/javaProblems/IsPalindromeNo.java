package javaProblems;

import java.util.Scanner;

public class IsPalindromeNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a no. to check if palindrome or not ?");
		int no=scan.nextInt();
		
		int n=no;//Assign no value to n to retain original value for future purpose
		int rem=0;
		int rev=0;
		
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
			
		}
		if(no==rev) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
