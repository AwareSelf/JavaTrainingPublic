package inheritanceex;

public class Manager extends Emp {

	private String mgrType;
	private double mgrComm;
	
		
	public Manager()
	{
		System.out.println("Manager no-arg constructor called..");
	}
	
	public Manager(int empid,String ename,double salary,String mgrType,double mgrComm)
	{
		super(empid,ename,salary);	
		System.out.println("Manager arg-wala constructor called..");
	
		
		this.mgrType = mgrType;
		this.mgrComm = mgrComm;
		
		
	}


	public String getMgrType() {
		return mgrType;
	}


	public void setMgrType(String mgrType) {
		this.mgrType = mgrType;
	}


	public double getMgrComm() {
		return mgrComm;
	}


	public void setMgrComm(double mgrComm) {
		this.mgrComm = mgrComm;
	}
	
	@Override
	public double calcAnnSal()
	{
		/*
		double annsalemp = super.calcAnnSal();
		return annsalemp + this.mgrComm;
		*/
		System.out.println("priniting annual salary of employee "+this.getEname());
		return super.calcAnnSal() +  this.mgrComm;
		
	
	}
	
	public void delegate()
	{
		System.out.println("Manager:"+ this.getEname()+" delegating work to his team members...");
	}
	
	
	@Override
	public String toString()
	{
		System.out.println("Manager toString() method called");
		
		return super.toString()+", manager type=" + this.mgrType
				               +", manager commission ="+this.mgrComm; 
	}
	
	
}
