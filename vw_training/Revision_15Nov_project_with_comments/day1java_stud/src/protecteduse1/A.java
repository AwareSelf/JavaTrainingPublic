package protecteduse1;

public class A {
	
	
	public A()
	{
		
	}
	
	
	void meth1A1()
	{
		System.out.println("base meth1");
	}
	
	protected void meth()
	{
		System.out.println("meth is protected method in A ..");
	}
	
	
	 void meth1()
	{
		System.out.println("meth1 is default access specifier method in A called..");
	}
	 
	 
	 public void meth3()
	 {
		 System.out.println("meth3 is public method in A called..");
		 
	 }

}
