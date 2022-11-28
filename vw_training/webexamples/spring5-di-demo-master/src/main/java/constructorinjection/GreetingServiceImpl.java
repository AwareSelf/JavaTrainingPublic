package constructorinjection;
public class GreetingServiceImpl implements GreetingService 
{
	private String greeting;
	public GreetingServiceImpl() {}
	
	public GreetingServiceImpl(String greeting) 
	{
		System.out.println("constructor is invoked");
		this.greeting = greeting;
	}
	public void sayGreeting() 
	{
		System.out.println(greeting);
	}
	public void setGreeting(String greeting) 
	{
		System.out.println("setGreeting is invoked");
		this.greeting = greeting;
	}
}