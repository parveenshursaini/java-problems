package javaProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Javapractice 
{

	public static void main(String[] args) 
	{
		
		String str="computer is an electronic device computer device is amazing";
		String[] sr=str.split(" ");
		HashMap<String,Integer> hm= new HashMap<>();
		for(String s:sr) 
		{
			Integer count=hm.get(s);
			if(count !=null) 
			{
				hm.put(s, count+1);
			}
			else 
			{
				hm.put(s, count);
			}
			//System.out.println(hm);
			
		}
		Iterator<String>itr=hm.keySet().iterator();
		System.out.println(hm.keySet());
		while(itr.hasNext())
		{
			String s1=itr.next();
			int j=hm.get(s1);
			
			if(j>1) 
			{
				System.out.println("the word"+s1+"repeat"+hm.get(s1)+"times");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Scanner scan=new Scanner(System.in); System.out.println("enter a number");
		 * int num=scan.nextInt(); int n=num,rem=0,rev=0; while(n!=0) { rem=n%10;
		 * rev=rev*10+rem; n=n/10; } if(num==rev){ System.out.println("is palindrome");
		 * } else{ System.out.println("no palindrome"); }
		 */
	}
}
