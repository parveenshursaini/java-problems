package javaProblems;

public class SecondLargestValueinArray 
{

	public static void main(String[] args) 
	{
		int []a= {22,33,12,56,34,98,43,2,6,7};
		int temp;
		for(int i=0;i<a.length;i++) 
		{   

			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
	            }
             }

         }
		System.out.println(a[1]);
	}
}