package autowiringanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("employeex")
public class Employeex 
{
	@Value("${emp.firstname}")
	private String firstname;
	
	@Value("${emp.lastname}")
	private String lastname;
	
	@Autowired
	private MyDatex birthdate;

	public Employeex()
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

    public void setBirthdate(MyDatex bday)
	{
		birthdate = bday;
	}


	public String toString()
	{
		return "FullName :: "+ this.firstname + this.lastname + "\n" + "BirthDate :: " + this.birthdate.toString();
	}

	
}