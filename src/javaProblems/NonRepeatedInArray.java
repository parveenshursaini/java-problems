package javaProblems;

public class NonRepeatedInArray {

	public static void main(String[] args) {
		int[] a= {3,9,4,3,5,5,4};
		int res=a[0];
		for(int i=1;i<a.length;i++) {
			res=res^a[i];
		}
        System.out.println("non repeated nos is : "+res);
	}

}
