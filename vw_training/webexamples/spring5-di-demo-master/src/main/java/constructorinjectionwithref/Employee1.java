package constructorinjectionwithref;

import constructorinjectionwithref.MyDate;

public class Employee1 
{
	private String firstname="dude";
	private String lastname="dude";
	private MyDate birthdate=null;

	public Employee1()
	{
		System.out.println("inside default constructor of Employee()");
	}

    public Employee1(String firstname)
	{
		System.out.println("inside constructor Employee(String)");
		this.firstname = firstname;
	}
	
	public Employee1(String firstname,String lastname)
	{
		System.out.println("inside constructor Employee(String,String)");
		this.firstname = firstname;
		this.lastname = lastname;
	}

    public Employee1(String firstname,String lastname,MyDate birthdate)
	{
		System.out.println("inside constructor Employee(String,String,Date)");
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}

	public String toString()
	{
		return "FullName :: "+ this.firstname + this.lastname + "\n" + "BirthDate :: " + this.birthdate.toString();
	}

	
}