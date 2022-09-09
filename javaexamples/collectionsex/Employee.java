package collectionsex;

public class Employee {
	
	private int empid;
	private String name;
	private double salary;
	
	
	
	Employee()
	{
		System.out.println("no-arg Employee constructor called");
		this.empid = 5;
		this.salary =1000;
		
	}
	
	
	//overloaded constructor
	Employee(int empid,String name,double salary)
	{
		System.out.println("arg based Employee constructor called");
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}
	
	
	double calcAnnSalary()
	{
		return this.salary*12;
	}
	
	double calcAnnSalary(double bonus)
	{
		return this.salary*12 + bonus;
	}

	
	public String toString()
	{
		//System.out.println(this.empid);
		return  "empid="+this.empid+",name="+this.name+",salary="+this.salary; 
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object o)
	{
		
		return this.empid == ((Employee)o).empid;
	}
	
	
}
