package javaProblems;

import java.util.Scanner;

public class PatternUptoDown {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        for (int i = 1; i <= rows; i++) 
	        {
	            int num = i;
	             
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(num+" ");
	                 
	                num = num+rows-j;
	            }
	             
	            System.out.println();
	        }
	         
	        sc.close();
	    }
	

	}


