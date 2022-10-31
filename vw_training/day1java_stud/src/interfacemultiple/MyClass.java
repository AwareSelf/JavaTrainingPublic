package interfacemultiple;

public abstract class MyClass implements Aable  {
	
	
	@Override
	public void a()
	{
		
		System.out.println("inside a() method, inside class "+ this.getClass().getName());
		
	}
	
	@Override
	public void b()
	{
		System.out.println("inside b() method, inside class "+ this.getClass().getName());
	}
	
	/*
	@Override
	public void c()
	{
		System.out.println("inside c() method, inside class "+ this.getClass().getName());
	}
	*/

}

class MyClass1 extends MyClass
{
	
	@Override
	public void c()
	{
		System.out.println("inside c() method, inside class "+ this.getClass().getName());
	}
	
}