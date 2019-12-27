package javaProblems;

public class BinarySearchArray {

	public static void main(String[] args) {
		int []a= {2,6,7,12,22,33,34,43,56,98};
		
		int search=50;
		int li=0;          //li is lowest index
		int hi=a.length-1; //hi is highest index
		int mi=(li+hi)/2;  //mi is middle index
		
		while(li<=hi) 
		{
			if(a[mi]==search) 
			{
				System.out.println(search +" is located at index "+ mi);
				break;
			}
			else if(a[mi]<search) 
			{
				li=mi+1;
			}
			else 
			{
			hi=mi-1;
		    }
		mi=(li+hi)/2;

	    }
		if(li>mi) 
		{
		System.out.println(search+" :not present in given array");	
		}
	 }
}
