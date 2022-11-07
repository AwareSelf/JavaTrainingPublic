package uselamda;


interface Bounceable1
{    int bounceFactor = 5;
	 void bounce();
	 default void showBounceFactor()
	 {
		 System.out.println("bounce factor is "+bounceFactor);
	 }
	 
	 static int getBaseFactor()
	 {
		 return bounceFactor;
	 }
}

class Ball1 implements Bounceable1
{
	int bf;
	Ball1()
	{
		//bf = Bounceable1.bounceFactor;
		bf = Bounceable1.getBaseFactor();
	}
	
	@Override
	public void bounce()
	{
		System.out.println("Ball is bouncing with bounce factor "+Bounceable1.bounceFactor);
	}
}

class Tyre implements Bounceable1
{
	int bf;
	
	Tyre()
	{
		//bf = Bounceable1.bounceFactor/2;
		bf = Bounceable1.getBaseFactor()/2;
	}
	
	@Override
	public void bounce()
	{
		System.out.println("Tyre is bouncing with bounce factor "+bf);
	}
	
	@Override
	public void showBounceFactor()
	 {
		 System.out.println("bounce factor is "+bf);
	 }
}
public class DefaultMethExx {
	
	
	public static void main(String[] args)
	{
	   Bounceable1 b = new Ball1();
	   b.bounce();
	   b.showBounceFactor();
	   
	   b = new Tyre();
	   b.bounce();
	   b.showBounceFactor();
	   
	}
	

}
