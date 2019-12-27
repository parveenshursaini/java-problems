package javaProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDupArrayHashmap 
{

	public static void main(String[] args) 
	{
		int[] a= {3,5,4,3,6,2,4,1};
		Map<Integer,Integer>hm=new HashMap<>();
		for(int no:a) 
		{
			Integer count=hm.get(no);
			if(count==null) 
			{
				hm.put(no, 1);
			}
			else 
			{
				hm.put(no, count+1);
			}
		}
		System.out.println("duplicate elements are ");
		Iterator<Integer>itr=hm.keySet().iterator();
		while(itr.hasNext()) 
		{
			Integer i=itr.next();
			int j=hm.get(i);
			if(j>1) 
			{
				System.out.println("Integer=" +i+"repeats"+j+" times");
			}
		}
		
       
     }
		
}


