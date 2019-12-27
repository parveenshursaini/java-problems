package javaProblems;

public class WaysToTraverseArray {

	public static void main(String[] args) {
		int[] a= {4,6,9,2,3,5,6};
		
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int i=0;
		while(i<a.length) {
			//System.out.print(a[i]+" ");
			i++;
		}
		System.out.println();
		
	for(int b:a) {
		System.out.print(b+" ");
	}
	}

}
