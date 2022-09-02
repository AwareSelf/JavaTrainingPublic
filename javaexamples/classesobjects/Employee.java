package classesobjects;

public class Employee {
	
	private int empid;
	private double salary;
	
	static int count = 5;
	
	
	static {
		
		count = 6;
		System.out.println("static block called.."+ count);
		
	}
	
	
	Employee()
	{
		System.out.println("no-arg Employee constructor called");
		this.empid = 5;
		this.salary =1000;
		count++;
	}
	
	
	//overloaded constructor
	Employee(int empid,double salary)
	{
		System.out.println("arg based Employee constructor called");
		this.empid = empid;
		this.salary = salary;
		count++;
	}
	
	
	double calcAnnSalary()
	{
		return this.salary*12;
	}
	
	double calcAnnSalary(double bonus)
	{
		return this.salary*12 + bonus;
	}

	
	void displayEmployee()
	{
		System.out.println(this.empid);
	}
}
