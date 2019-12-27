package javaProblems;

public class PatternReverse {

	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=5;i++){
		for(int j=1;j<=2;j++){
		if(i%2!=0){
		System.out.print(count+" ");
		count++;
		}
		if(i%2==0){
		if(j==1){
		System.out.print((count+1)+" ");
		}
		else{
		System.out.print((count-1)+" ");
		}
		count++;
		}

		}
		System.out.println();
		}
		}
		

	}


