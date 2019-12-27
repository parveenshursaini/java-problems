package javaProblems;

public class PpCcIssue 
{
	public void x() 
	{
		System.out.println(100);
    }
}	
class JavaA extends PpCcIssue
{
	public void a()
	{
		System.out.println(200);
    }
	public void c()
	{
			System.out.println(3);
	}
	
	public static void main(String[] args)
	{
		 PpCcIssue obj=new JavaA();
      obj.x();
      //obj.a();//we can call only parent class method by using P p=new C();
      //obj.c();//we can call only parent class method by using P p=new C();
      //output:Exception in thread "main" java.lang.Error: Unresolved compilation problems: The method a() is undefined for the type PpCcIssu The method c() is undefined for the type PpCcIssue

	}

}
