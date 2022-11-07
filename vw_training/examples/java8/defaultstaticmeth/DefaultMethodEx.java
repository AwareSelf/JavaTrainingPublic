package defaultstaticmeth;
interface Bounceable
{
	int bounceFactor = 5;
	void bounce();
	default void showBounceEntity(String entityName)
	{
		System.out.println("Bouncing entity is "+entityName);
	}
	
	static int getBounceFactor(int multiple)
	{
		return bounceFactor*multiple;
	}
}

class Ball implements Bounceable
{
	int bf;
	Ball()
	{
		//this.bf = Bounceable.bounceFactor*5;
		this.bf=Bounceable.getBounceFactor(5);
	}
	
	@Override
	public void bounce()
	{
		System.out.println("ball is bouncing with bounce factor"+this.bf);
	}

}

class Tyre implements Bounceable
{
	int bf;
    Tyre()
	{
		//this.bf = Bounceable.bounceFactor;
    	this.bf = Bounceable.getBounceFactor(1);
	}
	
	@Override
	public void bounce()
	{
		System.out.println("Tyre is bouncing with bounce factor"+this.bf);
	}
	
	@Override
	public void showBounceEntity(String entityName)
	{
		System.out.println( entityName + " is bouncing with bf ="+this.bf);
	}

}
public class DefaultMethodEx {

	public static void main(String[] args) {
		
		Bounceable b = new Ball();
		b.bounce();
		b.showBounceEntity("Ball");
		
		b = new Tyre();
		b.bounce();
		b.showBounceEntity("Tyre");
		
		
		meth(new Ball(),"Ball");
		
		Bounceable b1 = new Tyre();
		meth(b1,"Tyre");
		
		System.out.println(Bounceable.getBounceFactor(10));
				
	}
	
	static void meth(Bounceable b1,String entityName)
	{
		b1.bounce();
		b1.showBounceEntity(entityName);
	}

}
