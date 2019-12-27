package javaProblems;

public class MergeArrays {

	public static void main(String[] args) {
		int[]a= {10,20,30};
		int[]b= {40,50,60,70};
		
		int al=a.length;
		int bl=b.length;
		int cl=al+bl;   // need to calculate length for new array
		
		int[]c=new int[cl]; //new array with required length
		
		for(int i=0;i<al;i++) {
			c[i]=a[i];
			
		}
		for(int i=0;i<bl;i++) {
			c[al+i]=b[i];
			
		}
		for(int i=0;i<cl;i++) {
			
			System.out.print(c[i]+",");
		}
		
		
		
		
		

	}

}
