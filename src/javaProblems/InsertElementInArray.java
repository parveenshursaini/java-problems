package javaProblems;

public class InsertElementInArray 
{

	public static void main(String[] args) 
	{
		int[]a= {10,20,30,40,50,60};
		int index=3;
		int element=70;
		for(int i=a.length-1;i>index;i--) 
		{
			a[i]=a[i-1];	
		}
            a[index]=element;
            for(int i=0;i<a.length;i++) 
            {
			System.out.print(a[i]+" ");
            }
   }  
}
