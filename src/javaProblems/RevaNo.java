package javaProblems;

public class RevaNo {

	public static void main(String[] args) {
		int n=542798012, rev=0, rem=0;
		
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(rev);
		
		
	}
			
}

	
			

