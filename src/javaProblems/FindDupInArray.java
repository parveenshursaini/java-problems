package javaProblems;

import java.util.HashSet;
import java.util.Set;

public class FindDupInArray {

	public static void main(String[] args) {
		int[] a= {4,7,8,3,4,2,8,3,9};
		System.out.println("Duplicates are");
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]&& i!=j) 
				{
					System.out.println(a[j]+" ");
					
				}
			}
		}
		System.out.println("OR----------");
		System.out.println("Duplicates are");
		Set<Integer> s=new HashSet<>();
		for(int no:a) {
			if(s.add(no)==false) {
				System.out.println(no);
			}
		}
		
	}

}
