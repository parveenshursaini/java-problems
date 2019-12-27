package javaProblems;

public class ArrayTraverse2D3D {

	public static void main(String[] args) 
	{
		int[] a=new int [4];
		a[0]=5;
		a[1]=7;
		a[2]=9;
		a[3]=2;
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	
	
      int[][] b= {{1,2,3},{4,5}};
      
      for(int i=0;i<b.length;i++) 
      {
    	  for(int j=0;j<b[i].length;j++) 
    	  {
    		  System.out.print(b[i][j]+" ");
    		  
    	  }
    	  System.out.println();
    	  
      }
      int[][][] c= {{{1,2,3},{4,5}},{{7,8,9},{3,7,9,5}}};
      for(int i=0;i<c.length;i++) 
      {
    	  for(int j=0;j<c[i].length;j++) 
    	  {
    		  for(int k=0;k<c[i][j].length;k++)
    		  {
    			  System.out.print(c[i][j][k]+" ");
    		  }
    		  System.out.println();
    	  }
      }
   }
}
