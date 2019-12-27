package javaProblems;

public class DeleteElementFromArray 
{

	public static void main(String[] args) 
	{
		int[]a= {10,20,30,40,50,60};
		int element=20;
		int count = 0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==element) 
			{
				for(int j=i;j<a.length-1;j++) 
				{
				a[j]=a[j+1];
			    }
				count++;
			break;
			}
		}
		if(count==0) {
			System.out.println("element not found");
		}
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+", ");
		
	   }
   }
}
   
