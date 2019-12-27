package javaProblems;

import java.util.HashMap;
import java.util.Iterator;

public class DupWordInString 
{
	
	public static void findDupInString() 
	{
	String str="my name is is parveen kumar kumar is saini is";
	String [] sr =str.split (" ");
	
	HashMap<String,Integer> hs=new HashMap<>();
	
	for(String s:sr) 
	{
		Integer count=hs.get(s);
		if(count!=null)
		{
			hs.put(s, count+1);
		}
		else {hs.put(s, 1);
		}
	}
	System.out.println(hs);
	
	Iterator<String>itr=hs.keySet().iterator();
	while(itr.hasNext()) 
	{
		String s1=itr.next();
		int j=hs.get(s1);
		if(j>1) 
	{
	System.out.println("word = "+s1+", repeats "+ j+" times.");
	}
	}
	
	}
	
	

	public static void main(String[] args) 
	{
		
		findDupInString();
		
	}

}
