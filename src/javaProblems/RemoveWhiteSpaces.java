package javaProblems;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s="   Computer is an electronic device   ";
		String s1=s.replaceAll("\\s+", "");
		System.out.println(s1);
		
	System.out.println("------------");
		
		String s2=s.toUpperCase().replaceAll("\\s+", "");
		System.out.println(s2);
		
	System.out.println("------------");
		
		String s3=s2.toLowerCase();
		System.out.println(s3);
		
	System.out.println("------------");
		
		String[]strs=s.split("");
		for(String str :strs) {
			System.out.println(str);
		}
		
	System.out.println("------------");
		
		
		String[]words=s.split("\\s");
		for(String word:words) {
		System.out.println(word);
		}
			
	System.out.println("------------");
			
		String substr=s.substring(5, 20).replaceAll("\\s+", "");
		System.out.println(substr);
				
	 System.out.println("------------");
	
	     String s4=s.concat(" which can convert");
	     System.out.println(s4);
	     
	 System.out.println("------------");
	 
	     String s5=s.replace('e', 'x');
	     System.out.println(s5);
	     
	 System.out.println("------------");
	 int s6=s.length();
     System.out.println(s6);
	 
	 System.out.println("------------");
	 
	     String s7=s.stripLeading();
	     System.out.println(s7);
	     
	  System.out.println("------------");
	     
	     char s8=s.charAt(16);
	     System.out.println(s8);
	     
				
		
			
			
			
			
			
			
		
	}

}
