package javaProblems;

public class MaxMinValuueInArray {

	public static void main(String[] args) 
	{
		int []a= {22,33,12,56,34,98,43,2,6,7};
		
		int max=a[0];//22
		for(int i=1;i<a.length;i++) 
		{   
          if(a[i]>max) 
          {
        	  max=a[i];
          }
	    }
		System.out.println("max element is: "+max );
   
	
	    int min=a[0];//22
	    for(int i=1;i<a.length;i++) 
	    {   
            if(a[i]<min) 
            {
    	        min=a[i];
            }
          }
	   System.out.println("min element is: "+min );
	 }
}
