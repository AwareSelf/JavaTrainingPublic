package day3interface;

class Ball implements Bounceable
{
	int factor;
	
	public void setBounceFactor(int bouncef)
	{
		System.out.println("set bouncefactor "+ bouncef+" for a ball");
		this.factor =  bouncef*5;
		
	}
	
	
	public void bounce()
	{
		
		System.out.println("Ball is bouncing with a bounce factor ="+ this.factor);
	}
}
