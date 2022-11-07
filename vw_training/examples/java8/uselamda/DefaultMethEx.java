package uselamda;
interface Rollable {                                          
	int rollFactor = 5;
	
	void roll();
	
	default void showRollFactor()
	{
		System.out.println("Rollable entity with roll factor as "+rollFactor);
	}
}
class FootBall implements Rollable
{
	private int f;
	
	FootBall() { f = rollFactor*5; }
	
	@Override                                                                     
	public void roll()
	{
	  System.out.println("football rolls with roll factor "+f);
	}
}

public class DefaultMethEx {

	public static void main(String[] args)
	{
		Rollable r = new FootBall();
		r.showRollFactor();
		r.roll();
				
	}
}


