package collectionsex;

public class Employee implements Comparable<Employee> {
	
	private int empid;
	private String name;
	private double salary;
	private int deptno;
	
	
	

	
	public Employee(int empid, String name, double salary, int deptno) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.deptno = deptno;
	}

	double calcAnnSalary()
	{
		return this.salary*12;
	}
	
	double calcAnnSalary(double bonus)
	{
		return this.salary*12 + bonus;
	}

	
	


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", deptno=" + deptno + "]";
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
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public boolean equals(Object o)
	{
		System.out.println("equal method of Emp called...");
		return this.empid == ((Employee)o).empid;
	}
	
	
	public int compareTo(Employee e)
	{
		System.out.println("compareTo of Employee called..");
		
		   return this.empid - e.empid;
		
		//  return  e.empid - this.empid;  //descending order

	}
   
	@Override
	public int hashCode()
	{
		System.out.println("hashCode method of Emp called...");
		return this.deptno;
	}
	
	
	
}
