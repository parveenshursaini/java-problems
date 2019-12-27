package javaProblems;

import java.util.Scanner;

public class EvenNumber {
	

	   Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	Scanner scan= new Scanner(System.in);
	    	System.out.println("Enter a number");
	        int N = scan.nextInt();
	        
	       
	            if(N%2!=0){
	                System.out.println("weird");
	            }else if(N%2==0 && N>=6 && N<=20){
	            System.out.println("weird"); 
	            }else if(N%2==0 && N>=2 && N<=5){
	            System.out.println("Not weird");
	            }else if (N%2==0 && N>20){
	            System.out.println("Not weird");
	            }}}
	
	
	


