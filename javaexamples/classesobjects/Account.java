package classesobjects;

public class Account {
	
	
	private int acctId;
	private double bal;
	
	
	public Account(int acctId, double bal) {
		
		this.acctId = acctId;
		this.bal = bal;
	}
	
	
	public double getBal() {
		return bal;
	}
	
	
	public void setBal(double bal) {
		
		if(bal > 0)
	    	this.bal = bal;
		else
			System.out.println("balance can't be 0 or negative..");
	}
	
	public int getAcctId() {
		return acctId;
	}
	
	public void deposit(double amt)
	{
		this.bal = this.bal + amt;
	}
	
	public void withdraw(double amt)
	{
		if(amt < this.bal)
		  this.bal = this.bal - amt;
		else
			System.out.println("Insufficient balance="+this.bal
					         + " for acctid="+this.acctId
					         +" while withdrawing amt="+amt);
	}
	
	
	

}
