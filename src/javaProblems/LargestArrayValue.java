package javaProblems;

public class LargestArrayValue {
	
	public static void main(String[] args) {
	
	int[]r= {28,3,14,43,36,8,0,9,5,33};
	
	int value=r[0];
	
	for(int i=0;i<r.length;i++) {
		
		if ( r[i]>value) {
			value=r[i];
		}
	}
	System.out.println("largest valuue in the given array is " + value);
		
	}
	
}


