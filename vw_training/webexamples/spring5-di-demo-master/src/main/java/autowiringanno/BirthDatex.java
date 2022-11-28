package autowiringanno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BirthDatex implements MyDatex
{
	
	@Value("#{new Integer('${birthdate.date}')}")
//	@Value("${birthdate.date}")
	private int date;
	
	@Value("#{new Integer('${birthdate.month}')}")
//	@Value("${birthdate.month}")
	private int month;
	
	
	@Value("#{new Integer('${birthdate.year}')}")
//	@Value("${birthdate.year}")
	private int year;

	public BirthDatex()
	{ 
		System.out.println("inside default constructor BirthDate()");	
	}

	public int getMonth()
	{
		return this.month;
	}
	public int getDate()
	{
		return this.date;
	}
	public int getYear()
	{
		return this.year;
	}


	public void setMonth(int month)
	{
		this.month = month;
	}

    public void setDate(int date)
	{
		this.date = date;
	}

    public void setYear(int year)
	{
		this.year = year;
	}

	public String toString()
	{
		return "Date: " + getDate() + "Month: " + getMonth() + "Year: " + getYear();  
	}
}
