package inheritanceex;

public class Emp {
	
	private int empid;
	private String ename;
	private double salary;

	
	public Emp()
	{
		System.out.println("Employee no-arg constructor called..");
	}
	
	
	public Emp(int empid,String ename,double salary)
	{
		System.out.println("Employee arg-wala constructor called..");
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getEmpid() {
		return empid;
	}
	
	public double calcAnnSal()
	{
		System.out.println("priniting annual salary of employee "+this.ename);
		return this.salary*12;
	}
	
	
	@Override
	public String toString()
	{
		System.out.println("Emp toString() called..");
		return "empid="+this.empid
				+ ", ename="+this.ename
				+", salary="+this.salary;
	}
	

}
