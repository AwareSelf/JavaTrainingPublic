package day3interface;

public class Tyre implements Bounceable {
	
	int factor;
	
	public void setBounceFactor(int bouncef)
	{
		System.out.println("set bouncefactor "+ bouncef+" for a Tyre");
		this.factor =  bouncef;
		
	}
	
	
	public void bounce()
	{
		
		System.out.println("Tyre is bouncing with a bounce factor ="+ this.factor);
	}

}
