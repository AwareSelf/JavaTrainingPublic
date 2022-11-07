package uselamda;

interface Bounceable {
	void bounce(int f);
}

class Ball implements Bounceable
{
	public void bounce(int f1)
	{
		f1= f1*5; 
        System.out.println("ball bounces with bounnce factor "+f1);
		
	}
}
public class InnerClassEx {
	

	
	public static void main(String[] args)
	{
		//need to create separate class just to implement the interface
		Bounceable b = new Ball();
		
		/*
		b.bounce(5);
		
		func(b,5);
		func(new Ball(),10);
		
		
		//argument defined anonymous inner class
		func(new Bounceable() {
			public void bounce(int factor)
			{
				System.out.println("tyre bouncing with bounce factor "+factor);
			}
		} ,10);
		*/
		
	Bounceable blamda = (f) -> System.out.println("bouncing with bounce factor "+f);
        
	    blamda.bounce(6);
	    
		func(blamda,12);
		
		
	}
	
	static void func(Bounceable bb,int factor)
	{
		bb.bounce(factor);
	}
	

}
