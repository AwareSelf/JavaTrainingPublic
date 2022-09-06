package equalshashcodeex;

public class Emp {
	
	private int empid;
	private String ename;
	private double salary;
	private int deptno;

	
	public Emp()
	{
		System.out.println("Employee no-arg constructor called..");
	}
	
	
	

    public Emp(int empid, String ename, double salary, int deptno) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.deptno = deptno;
	}




	public boolean equals(Object o)
    {
    	System.out.println("Emp equal method called..");
    	/*
    	Emp x = (Emp)o;
    		
    	return this.empid==x.empid;
    	*/
    	
    	return this.empid == ((Emp)o).empid;
    }
	
	@Override
	public int hashCode()
	{
		return this.deptno;
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
	
	
	
	public int getDeptno() {
		return deptno;
	}




	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}




	public double calcAnnSal()
	{
		System.out.println("priniting annual salary of employee "+this.ename);
		return this.salary*12;
	}




	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", deptno=" + deptno + "]";
	}
	
	
	
	

}
