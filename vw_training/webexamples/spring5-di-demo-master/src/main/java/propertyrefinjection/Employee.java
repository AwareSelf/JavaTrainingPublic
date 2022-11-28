package propertyrefinjection;

public class Employee 
{
	private String firstname="dude";
	private String lastname="dude";
	private MyDate birthdate=null;

	public Employee()
	{
		System.out.println("inside default constructor of Employee()");
	}

    
	public void setFirstname(String name)
	{
		firstname = name;
	}

	public void setLastname(String name)
	{
		lastname = name;
	}

    public void setBirthdate(MyDate bday)
	{
		birthdate = bday;
	}


	public String toString()
	{
		return "FullName :: "+ this.firstname + this.lastname + "\n" + "BirthDate :: " + this.birthdate.toString();
	}

	
}