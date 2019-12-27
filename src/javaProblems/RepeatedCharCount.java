package javaProblems;

import java.util.HashMap;
import java.util.Iterator;

public class RepeatedCharCount {

	public static void main(String[] args)
	{
		String s="shursaini";
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char c:ch) 
		{
			Integer i=hm.get(c);
			if(i!=null)
			{
				hm.put(c, i+1);
			}else 
			{
				hm.put(c, 1);
			}
		}
		Iterator<Character> itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			Character ctr=itr.next();
			int j=hm.get(ctr);
			if(j>1) {
				System.out.println("character "+ctr+" repeats "+j+" times");
			}
		}

	}

}
