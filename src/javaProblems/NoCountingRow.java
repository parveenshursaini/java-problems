package javaProblems;

public class NoCountingRow {

	public static void main(String[] args) 
	{
        int count=1;
		for (int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("---------------------");
	
		int count1=1;
		for (int i=5;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(count1+ " ");
				count1++;
			}
			System.out.println();
		}
		
		}

	}


